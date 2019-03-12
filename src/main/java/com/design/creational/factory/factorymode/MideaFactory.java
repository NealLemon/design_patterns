package com.design.creational.factory.factorymode;

/**
 * @ClassName MideaFactory
 * @Description 美的生产工厂
 * @Author Neal
 * @Date 2019/3/6 15:00
 * @Version 1.0
 */
public class MideaFactory extends AirConditioningFactory{

    public AirConditioning produce() {
        System.out.println("美的工厂生产的空调");
        return new MideaAir();
    }
}
