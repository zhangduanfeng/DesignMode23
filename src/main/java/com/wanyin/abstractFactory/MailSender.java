package com.wanyin.abstractFactory;

public class MailSender implements Sender{
    @Override
    public void send() {
        System.out.println("this is mailSender!");
    }
}
