package com.design.medium;

public class MathTeacher extends Teacher {

    public MathTeacher(String name) {
        super(name);
    }

    @Override
    public void homework(String homework, StudentMediator studentMediator) {
        studentMediator.conveyHomework(this,homework);
    }
}
