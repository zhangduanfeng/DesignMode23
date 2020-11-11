package com.wanyin.single;

public class Singleton {

    private static Singleton instance = null;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                instance = new Singleton();
            }
            instance = new Singleton();
        }
        return instance;
    }

    public Object readResolve(){
        return instance;
    }
}
