package com.design.creational.builder;

/**
 * 就餐模式
 */
public enum EatMode {

    HERE("堂食"),
    OUTSIDE("外带");

    private String label;

    EatMode(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
