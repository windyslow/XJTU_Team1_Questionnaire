package org.jiaoda.mtappsys_team01.entity;

public class User {
    private Integer id;
    private String username;
    private String password;
    private String email;
    private Integer age;
    private Integer sex;
    private String address;

    //无参构造方法
    public User(){}
    //有参数构造方法
    public User(int id,String username,String password,String email,int age,int sex,String address){
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }
    //封装

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
