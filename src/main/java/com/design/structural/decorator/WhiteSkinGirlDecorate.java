package com.design.structural.decorator;

public class WhiteSkinGirlDecorate extends AbstractGirlDecorate {
    public WhiteSkinGirlDecorate(AbstractGirl abstractGirl) {
        super(abstractGirl);
    }

    @Override
    protected String feature() {
        return super.feature() + " 皮肤白 ";
    }

    @Override
    protected void otherThings() {
        System.out.println("温柔体贴");
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 面如凝脂 ";
    }
}
