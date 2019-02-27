package com.principle.invertdependency.wrong;

/**
 * @ClassName WrongTest
 * @Description 错误测试类
 * @Author Neal
 * @Date 2019/2/27 15:53
 * @Version 1.0
 */
public class WrongTest {

    public static void main(String[] args) {
        Student student = new Student();
        //学习选修
        student.studyElectives();
        //学习必修
        student.studyCompulsorCourse();
    }
}
