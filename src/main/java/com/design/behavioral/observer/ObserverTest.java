package com.design.behavioral.observer;

public class ObserverTest {

    public static void main(String[] args) {
        /**
         * 李雷的微博
         */
        WeiBo weiBo = new WeiBo();
        weiBo.setName("Lilei");
        /**
         * 李雷的好友韩梅梅
         */
        OtherFriends otherFriends1 = new OtherFriends("HanMeimei");
        /**
         * 李雷的好友Bob
         */
        OtherFriends otherFriends2 = new OtherFriends("Bob");
        /**
         * 关注了李雷的微博
         */
        weiBo.addObserver(otherFriends1);
        weiBo.addObserver(otherFriends2);
        /**
         * 李雷发布新动态
         */
        DynamicState dynamicState = new DynamicState();
        dynamicState.setContent("How are you?");
        weiBo.publishDynamicState(weiBo,dynamicState);
    }
}
