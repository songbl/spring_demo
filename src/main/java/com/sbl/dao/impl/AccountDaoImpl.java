package com.sbl.dao.impl;

import com.sbl.dao.IAccountDao;

import java.util.Date;


/**
 * 账户的持久层实现类
 */
public class AccountDaoImpl implements IAccountDao {

    private String name ;
    private Integer age;
    private Date birthday ;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public AccountDaoImpl(String name, Integer age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public  void saveAccount(){
        System.out.println("保存了账户"+name+"=="+age
        +"birthday"+birthday);
    }

    //如果没有默认的构造函数，那么默认的创建对象会失败
//    public AccountDaoImpl( String st) {
//    }
//
    public AccountDaoImpl() {
    }
}
