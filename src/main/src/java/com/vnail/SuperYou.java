package com.vnail;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SuperYou {
    @Test
    public void demo1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-common.xml");

        SuperMe  superMe = ctx.getBean("superMe",SuperMe.class);

        System.out.println(superMe);

    }
}
