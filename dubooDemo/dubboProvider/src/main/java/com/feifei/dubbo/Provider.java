package com.feifei.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author xurunfei
 * @date 2017/12/25.
 */
public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("provider.xml");
        System.out.println(ctx.getDisplayName()+":here");
        ctx.start();
        System.out.println("服务已启动............................");
        System.in.read();
    }
}
