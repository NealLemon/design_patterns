package com.design.creational.factory.abstractfactory;

/**
 * @InterfaceName ElectricFactory
 * @Description 电器工厂
 * @Author Neal
 * @Date 2019/3/6 15:36
 * @Version 1.0
 */
public interface ElectricFactory {

    /**
     * 生产空调
     * @return
     */
    AirConditioning produceAirConditioning();

    /**
     * 生产冰箱
     * @return
     */
    Refrigerator produceRefrigerator();

    /**
     * 生产洗衣机
     * @return
     */
    Washer produceWasher();

}
