package com.principle.invertdependency.right;

/**
 * @ClassName Student
 * @Description 学生类
 * @Author Neal
 * @Date 2019/2/27 16:17
 * @Version 1.0
 */
public class Student {

    /**
     * 定义了学习课程方法
     * @param iCourse  课程接口
     */
    public void studyCourse(ICourse iCourse) {
        iCourse.studyCourse();
    }

}
