package com.design.structural.bridge;

/**
 * 安卓手机
 */
public class AndroidPhone extends PhoneOs {
    public AndroidPhone(SocialSofware socialSofware) {
        super(socialSofware);
    }

    @Override
    SocialSofware open() {
        System.out.println("安卓系统打开软件");
        return socialSofware.openSoftware();
    }
}
