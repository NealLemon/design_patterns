package com.design.creational.factory.factorymode;

/**
 * @ClassName GreeFactory
 * @Description 格力工厂
 * @Author Neal
 * @Date 2019/3/6 15:01
 * @Version 1.0
 */
public class GreeFactory extends AirConditioningFactory {
    public AirConditioning produce() {
        System.out.println("格力工厂生产的空调");
        return new GreeAir();
    }
}
