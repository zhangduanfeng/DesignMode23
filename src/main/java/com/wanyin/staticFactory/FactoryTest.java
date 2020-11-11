package com.wanyin.staticFactory;

public class FactoryTest {
    public static void main(String[] args) {
        /*SendFactory sendFactory = new SendFactory();
        Sender sms = sendFactory.produceMail();*/
        Sender sender = SendFactory.produceMail();
        sender.send();
        //sms.send();
    }
}
