package org.jiaoda.mtappsys_team01.controller;

import org.jiaoda.mtappsys_team01.biz.questionnairesBiz;
import org.jiaoda.mtappsys_team01.entity.questionnaires;
import org.jiaoda.mtappsys_team01.utils.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/questionnaires")
public class questionnariesController {
    @Autowired
    private questionnairesBiz questionnairebiz;
    @GetMapping("/create")
    @ResponseBody
    public JSONResult createquestionnaire(questionnaires questionnaire){
        //调用业务逻辑层中创建用户方法
        int max=questionnairebiz.germaxqnid();
        questionnaire.setQuestionnaire_id(max+1);
        if(questionnairebiz.createQuestionnaires(questionnaire)){//问卷创建成功
            return JSONResult.ok(questionnaire);
        }else{
            return JSONResult.errorMsg("问卷创建失败");
        }
    }

}