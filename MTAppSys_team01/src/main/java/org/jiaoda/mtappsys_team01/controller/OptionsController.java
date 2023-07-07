package org.jiaoda.mtappsys_team01.controller;

import org.jiaoda.mtappsys_team01.biz.optionBiz;
import org.jiaoda.mtappsys_team01.entity.countresult;
import org.jiaoda.mtappsys_team01.utils.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/options")
public class OptionsController {
    @Autowired
    private optionBiz optionbiz;
    @PostMapping ("/countresult")
    @ResponseBody
    public JSONResult getcountresult(int questionnaire_id){
        List<countresult> myList = optionbiz.getcountresult(questionnaire_id);
        if(myList != null && myList.size() != 0)
        {
            return JSONResult.ok(myList);
        }
        else{
            return JSONResult.errorMsg("统计查询失败");
        }
    }
}
