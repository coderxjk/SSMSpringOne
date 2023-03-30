package com.ayguigu.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.ayguigu.aop.jiSuanJi;
import com.ayguigu.aop.jiSuanJiImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class testSpringOne {
    @Test
    public void testOne() throws SQLException {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ll.xml");
        DruidDataSource bean = applicationContext.getBean(DruidDataSource.class);
        System.out.println(bean.getConnection());

    }
    @Test
    public void testAop(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop.xml");
        jiSuanJi bean = ioc.getBean(jiSuanJi.class);
        bean.chu(8,4);


    }
}
