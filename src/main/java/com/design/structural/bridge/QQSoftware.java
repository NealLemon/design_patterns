package com.design.structural.bridge;

/**
 * QQ软件
 */
public class QQSoftware implements SocialSofware {
    @Override
    public SocialSofware openSoftware() {
        System.out.println("打开QQ");
        return new QQSoftware();
    }

    @Override
    public void chat() {
        System.out.println("使用QQ进行聊天");
    }
}
