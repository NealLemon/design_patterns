package com.design.medium;

public class EnglishTeacher extends Teacher {

    public EnglishTeacher(String name) {
        super(name);
    }

    @Override
    public void homework(String homework, StudentMediator studentMediator) {
        studentMediator.conveyHomework(this,homework);
    }
}
