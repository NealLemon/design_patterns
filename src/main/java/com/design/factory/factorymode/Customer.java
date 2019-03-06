package com.design.factory.factorymode;

/**
 * @ClassName Customer
 * @Description 顾客
 * @Author Neal
 * @Date 2019/3/6 15:03
 * @Version 1.0
 */
public class Customer {

    public static void main(String[] args) {

        System.out.println("顾客去商场跟导购员说，我想要一个格力空调");
        System.out.println("首先导购员给客户找到是格力工厂生产的空调");
        AirConditioningFactory greeFactory = new GreeFactory();
        System.out.println("接着告诉客户这是格力生产的");
        AirConditioning greeAir = greeFactory.produce();
        System.out.println("客户不满意，觉得美的好，又让导购员展示美的空调");
        AirConditioningFactory mideaFactory = new MideaFactory();


        System.out.println("导购给客户看了几个美的生产的空调");
        AirConditioning mideaAir =  mideaFactory.produce();
        System.out.println("客户很满意，决定购买");
        mideaAir.buy();

    }
}
