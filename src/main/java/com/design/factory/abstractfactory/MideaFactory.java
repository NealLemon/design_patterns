package com.design.factory.abstractfactory;

/**
 * @ClassName MideaFactory
 * @Description 美的生产工厂
 * @Author Neal
 * @Date 2019/3/6 15:46
 * @Version 1.0
 */
public class MideaFactory implements ElectricFactory {

    public AirConditioning produceAirConditioning() {
        return new MideaAirConditioning();
    }

    public Refrigerator produceRefrigerator() {
        return new MideaRefrigerator();
    }

    public Washer produceWasher() {
        return new MideaWasher();
    }
}
