package com.design.behavioral.chain;

public class Test {

    public static void main(String[] args) {
        Person person = new Person();
        Investigation cred = new CreditInvestigation();
        Investigation inCome = new IncomeInvestigation();
        ApprovalChain bankChain = new BankApprovalChain(cred,person);
        ((BankApprovalChain) bankChain).setNextInvestigation(inCome);
        bankChain.doApproval();
    }
}
