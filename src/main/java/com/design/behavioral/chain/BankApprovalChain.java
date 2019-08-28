package com.design.behavioral.chain;

public class BankApprovalChain implements ApprovalChain {

    //当前审核
    private Investigation investigation;

    //审核的人
    private Person person;

    public BankApprovalChain(Investigation investigation, Person person) {
        this.investigation = investigation;
        this.person = person;
    }

    //下一步审核
    private Investigation nextInvestigation;

    public void setNextInvestigation(Investigation nextInvestigation) {
        this.nextInvestigation = nextInvestigation;
    }

    @Override
    public void doApproval() {
        if(investigation.investigate(person)) {
            nextInvestigation.investigate(person);
        }
    }
}
