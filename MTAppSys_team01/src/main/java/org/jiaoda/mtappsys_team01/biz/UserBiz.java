package org.jiaoda.mtappsys_team01.biz;

import org.jiaoda.mtappsys_team01.dao.IUserDao;
import org.jiaoda.mtappsys_team01.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 用户业务逻辑层
 */
@Service
public class UserBiz {

    //注入用户的数据访问层
    @Autowired
    private IUserDao userDao;

    //根据用户名查找指定用户对象
    public User getUserByName(String username) {
        //调用数据访问层中的根据用户名查找指定用户对象的方法
        User user = userDao.getUserByName(username);
        return user;
    }

    /**
     * 创建用户
     * @param user
     */
    public boolean createUser(User user){
        boolean result = true;//默认表示创建用户成功
        try{
            //调用数据访问层创建用户的方法
             result = userDao.createUser(user);
        }catch (Exception e){
            e.printStackTrace();//打印异常堆栈信息
            result  = false;//添加用户失败
        }
        return result;
    }
}