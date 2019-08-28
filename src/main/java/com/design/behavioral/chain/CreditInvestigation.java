package com.design.behavioral.chain;

public class CreditInvestigation implements Investigation {

    @Override
    public boolean investigate(Person person) {
        if(person.credit) {
            System.out.println("征信通过审核");
            return true;
        }else{
            System.out.println("征信未通过审核");
            return false;
        }
    }
}
