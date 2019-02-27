package com.principle.invertdependency.right;

/**
 * @ClassName ElectiveCourse
 * @Description 选修课程
 * @Author Neal
 * @Date 2019/2/27 16:12
 * @Version 1.0
 */
public class ElectiveCourse implements ICourse{

    public void studyCourse() {
        System.out.println("学生开始学习选修课.....");
    }
}
