package com.design.factory.abstractfactory;

/**
 * @ClassName MideaFactory
 * @Description 美的生产工厂
 * @Author Neal
 * @Date 2019/3/6 15:46
 * @Version 1.0
 */
public class GreeFactory implements ElectricFactory {

    public AirConditioning produceAirConditioning() {
        return new GreeAirConditioning();
    }

    public Refrigerator produceRefrigerator() {
        return new GreeRefrigerator();
    }

    public Washer produceWasher() {
        return new GreeWasher();
    }
}
