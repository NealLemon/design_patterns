package com.design.behavioral.observer;


import java.util.Observable;
import java.util.Observer;

/**
 * 其他朋友 观察者
 */
public class OtherFriends implements Observer {

    //朋友名称
    private String name;

    public OtherFriends(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        WeiBo circleOfFriends = (WeiBo) o;
        System.out.println("朋友;" + name + "在"+circleOfFriends.getName()+"的微博,发布的动态:下点赞了。");
    }
}
