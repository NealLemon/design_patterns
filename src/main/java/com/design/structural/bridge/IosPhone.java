package com.design.structural.bridge;

/**
 * 苹果操作系统
 */
public class IosPhone extends PhoneOs{

    public IosPhone(SocialSofware socialSofware) {
        super(socialSofware);
    }

    @Override
    SocialSofware open() {
        System.out.println("苹果系统打开软件");
        return socialSofware.openSoftware();
    }
}
