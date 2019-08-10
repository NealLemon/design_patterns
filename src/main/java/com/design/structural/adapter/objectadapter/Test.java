package com.design.structural.adapter.objectadapter;
import com.design.structural.adapter.classadapter.AdaptTarget;
import com.design.structural.adapter.classadapter.Adapter;
import com.design.structural.adapter.classadapter.TargetClass;

public class Test {
    public static void main(String[] args) {
        //目标原方法
        AdaptTarget target = new TargetClass();
        target.request();

        System.out.println("-------业务调整 需要适配其他方法----------");

        //使用适配器,获取适配的目标类方法
        AdaptTarget adaptTarget = new Adapter();
        adaptTarget.request();
    }
}
