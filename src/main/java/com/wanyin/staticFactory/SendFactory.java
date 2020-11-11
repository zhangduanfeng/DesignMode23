package com.wanyin.staticFactory;

public class SendFactory {

    /*public Sender produce(String type){
        switch (type){
            case "mail":
                return new MailSender();
            case "sms":
                return new SmsSender();
            default:
                System.out.println("请输入正确的类型!");
                return null;
        }
    }*/
    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }

}
