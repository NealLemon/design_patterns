package com.design.structural.decorator;

public class DecoratorBootStrap {
    public static void main(String[] args) {
        //你心里的第一要求的女孩
        AbstractGirl abstractGirl = new YourGirl();
        //进一步细化一下,要求腿长
        abstractGirl = new LongLegsGirlDecorate(abstractGirl);
        System.out.println("想要一个腿长的女神，我们要");
        ((LongLegsGirlDecorate) abstractGirl).otherThings();
        //既然腿长怎么可能少了肤白
        abstractGirl = new WhiteSkinGirlDecorate(abstractGirl);
        System.out.println("再想要腿长和肤白,我们要");
        ((WhiteSkinGirlDecorate) abstractGirl).otherThings();
        System.out.println("你心里要求的女孩标准是" + abstractGirl.feature());
        System.out.println("必须满足:" + abstractGirl.getDesc());
    }
}
