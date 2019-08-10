package com.design.structural.adapter.objectadapter;

public class Adapter implements AdaptTarget {
    //组合被适配的对象
    AdaptedClass adaptedClass = new AdaptedClass();

    public Adapter() {
        System.out.println("适配开始");
        System.out.println("组合 被适配对象 -- AdaptedClass");
    }

    @Override
    public void request() {
        System.out.println("适配成功");
        System.out.println("目标类输出被适配器的方法结果--");
        adaptedClass.AdaptedOwnMethod();
    }
}
