package com.design.structural.decorator;

/**
 * 你眼中的女神
 */
public class YourGirl extends AbstractGirl {


    @Override
    protected String feature() {
        return "是一个女生";
    }

    @Override
    protected String getDesc() {
        return "漂亮";
    }
}
