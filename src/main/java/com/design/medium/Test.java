package com.design.medium;

public class Test {

    public static void main(String[] args) {
        Teacher englishTeacher = new EnglishTeacher("英语老师");
        Teacher mathTeacher = new MathTeacher("数学老师");
        StudentMediator mediator = new Monitor();
        mathTeacher.homework("背诵唐诗300首",mediator);
        englishTeacher.homework("试卷2套",mediator);
    }
}
