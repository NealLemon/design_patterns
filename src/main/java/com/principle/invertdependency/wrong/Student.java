package com.principle.invertdependency.wrong;

/**
 * @ClassName Student
 * @Description 学生类
 * @Author Neal
 * @Date 2019/2/27 15:43
 * @Version 1.0
 */
public class Student {

    /**
     *  学习选修课
     */
    public void studyElectives() {
        System.out.println("学生开始学习选修课.....");
    }

    /**
     * 学习必修课
     */
    public void studyCompulsorCourse() {
        System.out.println("学生开始学习必修课......");
    }
}
