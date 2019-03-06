package com.design.factory.abstractfactory;

/**
 * @ClassName RichCustomer
 * @Description TODO
 * @Author Neal
 * @Date 2019/3/6 15:54
 * @Version 1.0
 */
public class RichCustomer {

    public static void main(String[] args) {
        System.out.println("挑选美商品");
        ElectricFactory mideaFactory = new MideaFactory();
        System.out.println("挑选空调");
        AirConditioning mideaConditioning  = mideaFactory.produceAirConditioning();
        System.out.println("挑选冰箱");
        Refrigerator mideaRefrigerator = mideaFactory.produceRefrigerator();
        System.out.println("挑选洗衣机");
        Washer mideaWasher  = mideaFactory.produceWasher();

        System.out.println("购买套餐");
        mideaConditioning.buy();
        mideaRefrigerator.buy();
        mideaWasher.buy();


    }
}
