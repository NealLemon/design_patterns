package com.design.factory.abstractfactory;

/**
 * @ClassName MideaAirConditioning
 * @Description 格力空调
 * @Author Neal
 * @Date 2019/3/6 15:47
 * @Version 1.0
 */
public class GreeAirConditioning extends AirConditioning {
    public void buy() {
        System.out.println("购买套餐，格力空调");
    }
}
