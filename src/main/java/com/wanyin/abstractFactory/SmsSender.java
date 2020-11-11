package com.wanyin.abstractFactory;

import javax.sound.midi.Soundbank;

public class SmsSender implements Sender{

    @Override
    public void send() {
        System.out.println("this is smsSender!");
    }
}
