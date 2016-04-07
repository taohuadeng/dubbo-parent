package com.thd.dubbo._01;


import com.thd.dubbo.action.ChatAction;

public class WebTestMain {

    public static void main(String[] args) throws InterruptedException {
    	int i=0;
    	while(i++<10){
    		ChatAction act = new ChatAction();
    		act.SayHello();
    		Thread.sleep(1);
    	}
    }

}
