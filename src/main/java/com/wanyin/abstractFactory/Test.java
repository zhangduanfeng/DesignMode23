package com.wanyin.abstractFactory;

public class Test {
    public static void main(String[] args) {
        SendMailFactory sendMailFactory = new SendMailFactory();
        Sender sender = sendMailFactory.produce();
        sender.send();
        SendSmsFactory sendSmsFactory = new SendSmsFactory();
        Sender sender1 = sendSmsFactory.produce();
        sender1.send();
    }
}
