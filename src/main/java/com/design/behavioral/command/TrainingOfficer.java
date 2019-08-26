package com.design.behavioral.command;

/**
 * 教官类
 */
public class TrainingOfficer {

    /**
     * 稍息
     */
    public void haveRest() {
        System.out.println("听我口令： 稍息");
    }

    /**
     * 立正
     */
    public void attention() {
        System.out.println("听我口令 ： 立正");
    }
}
