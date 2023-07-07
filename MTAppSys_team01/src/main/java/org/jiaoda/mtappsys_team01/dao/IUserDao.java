package org.jiaoda.mtappsys_team01.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.jiaoda.mtappsys_team01.entity.User;

/**
 * 用户数据访问层
 */
@Mapper
public interface IUserDao {
    //根据用户名查找指定用户
    @Select("select id,username,password,email,age,sex,address from tab_user where username =#{username}")
    User getUserByName(String username);

    /**
     * 创建用户
     * @param user
     */
    @Insert("insert into tab_user(id,username, password, email, age,sex, address) values(#{id},#{username},#{password},#{email},#{age},#{sex},#{address})")
    boolean createUser(User user);


}
