package com.principle.invertdependency.right;

/**
 * @ClassName JavaCourse
 * @Description 学习JAVA必修课
 * @Author Neal
 * @Date 2019/2/27 16:15
 * @Version 1.0
 */
public class JavaCourse extends CompulsorCourse {

    @Override
    public void studyCourse() {
        System.out.println("学生学习JAVA必修课");
    }
}
