package org.jiaoda.mtappsys_team01.biz;

import org.jiaoda.mtappsys_team01.dao.IquestionnairesDao;
import org.jiaoda.mtappsys_team01.entity.questionnaires;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class questionnairesBiz {
    @Autowired
    private IquestionnairesDao questionnaireDao;

    public boolean createQuestionnaires(questionnaires questionnaire){
        boolean result = true;
        try{
            //调用数据访问层创建用户的方法
            result = questionnaireDao.createquestionnaires(questionnaire);
        }catch (Exception e){
            e.printStackTrace();//打印异常堆栈信息
            result  = false;//添加用户失败
        }
        return result;
    }

    public int germaxqnid(){
        return questionnaireDao.getmaxqnid();
    }
}
