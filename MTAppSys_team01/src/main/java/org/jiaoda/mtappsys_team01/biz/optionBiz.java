package org.jiaoda.mtappsys_team01.biz;

import org.jiaoda.mtappsys_team01.dao.IoptionsDao;
import org.jiaoda.mtappsys_team01.entity.countresult;
import org.jiaoda.mtappsys_team01.entity.options;
import org.jiaoda.mtappsys_team01.entity.questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class optionBiz {
    @Autowired
    private IoptionsDao optionDao;
    public boolean createoption(options option) {
        boolean result = true;
        try{
            //调用数据访问层创建用户的方法
            result = optionDao.createoption(option);
        }catch (Exception e){
            e.printStackTrace();//打印异常堆栈信息
            result  = false;//添加用户失败
        }
        return result;
    }

    public List<countresult> getcountresult(int questionnaire_id)
    {
        List<countresult> mylist = optionDao.getcountresult(questionnaire_id);
        return mylist;
    }
}
