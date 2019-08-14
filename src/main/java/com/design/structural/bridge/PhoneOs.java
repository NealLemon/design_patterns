package com.design.structural.bridge;

/**
 * 手机操作系统
 */
public abstract class PhoneOs {

    /**
     * 只有子类可以调用
     */
    protected SocialSofware socialSofware;

    public PhoneOs(SocialSofware socialSofware) {
        this.socialSofware = socialSofware;
    }

    /**
     * 打开软件
     * @return
     */
    abstract SocialSofware open();

}
