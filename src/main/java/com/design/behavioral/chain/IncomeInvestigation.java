package com.design.behavioral.chain;

public class IncomeInvestigation implements Investigation {

    @Override
    public boolean investigate(Person person) {
        if(person.income) {
            System.out.println("收入过关");
            return true;
        }else{
            System.out.println("收入未过关");
            return false;
        }
    }
}
