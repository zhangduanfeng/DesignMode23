package com.wanyin.staticFactory;

public class SmsSender implements Sender{
    @Override
    public void send() {
        System.out.println("this is smsSender!");
    }
}
