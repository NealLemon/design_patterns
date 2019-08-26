package com.design.behavioral.observer;

import java.util.Observable;

/**
 * 微博 被观察对象
 */
public class WeiBo extends Observable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 发布动态
     */
    public void publishDynamicState(WeiBo weiBo, DynamicState dynamicState) {
        System.out.println(weiBo.getName() +"发布了一条内容为:" + dynamicState.getContent()+"的动态");
        //改变状态 标识当前对象有所改变
        setChanged();
        //通知观察者
        notifyObservers();
    }
}
