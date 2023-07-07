package org.jiaoda.mtappsys_team01.controller;
import org.jiaoda.mtappsys_team01.biz.optionBiz;
import org.jiaoda.mtappsys_team01.biz.questionsBiz;
import org.jiaoda.mtappsys_team01.entity.options;
import org.jiaoda.mtappsys_team01.entity.quesopt;
import org.jiaoda.mtappsys_team01.entity.quesopts;
import org.jiaoda.mtappsys_team01.entity.questions;
import org.jiaoda.mtappsys_team01.utils.JSONResult;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class questionsController {
    @Autowired
    private questionsBiz questionBiz;
    @Autowired
    private optionBiz optionsBiz;
    @PostMapping("/create")
    @ResponseBody
    public JSONResult createquestion(@RequestBody quesopts quesoptns) {
        for (int i = 0; i < quesoptns.getQuesoptns().size(); i++) {
            int max=questionBiz.getmaxquesid();
            questions question = new questions(max+1, quesoptns.getQuestionnaire_id(), quesoptns.getQuesoptns().get(i).getTitle(), quesoptns.getQuesoptns().get(i).getType());
            if (questionBiz.createQuestion(question)) {//问卷创建成功
            } else {
                return JSONResult.errorMsg("问题创建失败");
            }
            for (int j = 0; j < quesoptns.getQuesoptns().get(i).getChoices().size(); j++) {
                options option = new options(max+1, quesoptns.getQuesoptns().get(i).getChoices().get(j).getText());
                if (optionsBiz.createoption(option)) {//问卷创建成功
                } else {
                    return JSONResult.errorMsg("选项创建失败");
                }
            }
        }
        return JSONResult.ok();
    }
}
