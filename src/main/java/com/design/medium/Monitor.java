package com.design.medium;

/**
 * 班长
 */
public class Monitor extends StudentMediator {

    @Override
    public void conveyHomework(Teacher teacher,String homework) {
        if("语文老师".equals(teacher.getName())) {
            System.out.println("自己去教室布置作业");
        }else{
            System.out.println(teacher.getName()+ "布置作业:" + homework);
        }
    }
}
