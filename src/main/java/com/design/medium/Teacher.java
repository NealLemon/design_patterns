package com.design.medium;

/**
 * 老师
 */
public abstract class Teacher {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void homework(String homework, StudentMediator studentMediator);
}
