package com.wanyin.staticFactory;


/**
 * 我们举一个发送邮件和短信的例子
 */
public class MailSender implements Sender{

    @Override
    public void send() {
        System.out.println("this is mailSender!");
    }
}
