package com.design.structural.adapter.classadapter;

/**
 * 适配器
 */
public class Adapter extends AdaptedClass implements AdaptTarget{

    public Adapter() {
        System.out.println("适配开始");
    }

    @Override
    public void request() {
        System.out.println("适配成功");
        System.out.println("目标类输出被适配器的方法结果--");
        super.AdaptedOwnMethod();
    }
}
