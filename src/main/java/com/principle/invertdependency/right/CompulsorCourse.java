package com.principle.invertdependency.right;

/**
 * @ClassName CompulsorCourse
 * @Description 必修课
 * @Author Neal
 * @Date 2019/2/27 16:12
 * @Version 1.0
 */
public class CompulsorCourse implements ICourse{

    public void studyCourse() {
        System.out.println("学生开始学习必修课.....");
    }
}
