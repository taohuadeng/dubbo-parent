package com.thd.dubbo.action;

import java.util.Date;

import com.thd.dubbo.service.DemoServer;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ChatAction {
    public void SayHello() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationConsumer.xml"});
        context.start();
        DemoServer demoServer = (DemoServer) context.getBean("demoService");
        System.out.println("client:" + demoServer.sayHello("---------->>>> TaoHuaDeng 1:" + new Date()) + " 3:" + new Date());
    }
}
