package com.design.structural.bridge;

public class BridgeTest {

    public static void main(String[] args) {
        /**
         * IOS打开QQ
         */
        PhoneOs iosQQ = new IosPhone(new QQSoftware());
        QQSoftware qqSoftware = (QQSoftware) iosQQ.open();
        qqSoftware.chat();

        /**
         * 安卓打开weichat
         */
        PhoneOs androidWeiChat = new AndroidPhone(new WeichatSoftware());
        WeichatSoftware weichatSoftware = (WeichatSoftware) androidWeiChat.open();
        weichatSoftware.chat();

    }
}
