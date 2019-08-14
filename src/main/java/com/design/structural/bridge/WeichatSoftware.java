package com.design.structural.bridge;

/**
 * 微信软件
 */
public class WeichatSoftware implements SocialSofware {
    @Override
    public SocialSofware openSoftware() {
        System.out.println("打开微信");
        return new WeichatSoftware();
    }

    @Override
    public void chat() {
        System.out.println("使用微信进行聊天");
    }
}
