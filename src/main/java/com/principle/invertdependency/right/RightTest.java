package com.principle.invertdependency.right;

/**
 * @ClassName RightTest
 * @Description TODO
 * @Author Neal
 * @Date 2019/2/27 16:17
 * @Version 1.0
 */
public class RightTest {

    public static void main(String[] args) {
        //首先我们创建学生对象
        Student student = new Student();

        //学生去学习必修课。
        CompulsorCourse compulsorCourse= new CompulsorCourse();
        student.studyCourse(compulsorCourse);

        //学生去学习选修课
        ElectiveCourse electiveCourse = new ElectiveCourse();
        student.studyCourse(electiveCourse);

        //学生去学习具体的一门课程 比如JAVA
        JavaCourse javaCourse = new JavaCourse();
        student.studyCourse(javaCourse);
    }
}
