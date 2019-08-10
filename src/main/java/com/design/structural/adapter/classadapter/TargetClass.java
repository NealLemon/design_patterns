package com.design.structural.adapter.classadapter;

/**
 * 目标类的原始实现
 */
public class TargetClass implements AdaptTarget {
    @Override
    public void request() {
        System.out.println("目标的原方法");
    }
}
