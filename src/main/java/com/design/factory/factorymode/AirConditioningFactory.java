package com.design.factory.factorymode;

/**
 * @ClassName AirConditioningFactory
 * @Description 空调生产工厂
 * @Author Neal
 * @Date 2019/3/6 14:56
 * @Version 1.0
 */
public abstract class AirConditioningFactory {

    /**
     * 生产空调
     * @return
     */
    public abstract AirConditioning produce();
}
