package com.design.structural.decorator;

public class LongLegsGirlDecorate extends AbstractGirlDecorate {
    public LongLegsGirlDecorate(AbstractGirl abstractGirl) {
        super(abstractGirl);
    }

    @Override
    protected String feature() {
        return super.feature() + " 大长腿 ";
    }

    @Override
    protected void otherThings() {
        System.out.println("努力赚钱");
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "身高1米7";
    }
}
