package com.ssmproject.dao;

import com.ssmproject.entity.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by DELL on 2018/1/27.
 */
public class UserMapperTest {
    private ApplicationContext applicationContext;
    @Autowired
    private UserMapper userMapper;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");//加载spring配置文件
        userMapper = applicationContext.getBean(UserMapper.class);//在这里导入要测试的
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void insert() throws Exception {
        User user = new User();
        user.setId(12);
        int result = userMapper.insert(user);
        System.out.println(result);
        assert (result == 1);
    }


    @Test
    public void tests(){
       Integer id =  userMapper.get();
        System.out.println(id);
    }
}