package com.feifei.dubbo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xurunfei
 * @date 2017/12/25.
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("consumer.xml");
        ctx.start();
        DemoService demoService = ctx.getBean(DemoService.class);
        int a = demoService.getNumber(3);
        System.out.println("result:::::::::::::"+a);

        String name = demoService.getName("飞飞");
        System.out.println(name);
    }
}
