package com.principle.openclose;

/**
 * @ClassName OpenCloseTest
 * @Description 开闭原则测试类
 * @Author Neal
 * @Date 2019/2/26 20:19
 * @Version 1.0
 */
public class OpenCloseTest {

    public static void main(String[] args) {
        //正常销售的时候
        IGood colaGood = new ColaGood("可口可乐",77,5);
        System.out.println("当前商品ID是:"+ colaGood.getGoodId() +",商品名称是:"+colaGood.getGoodName() +"商品价格是:" + colaGood.getGoodPrice());
        //节假日促销的时候 打6折
        System.out.println("-------由于是节假日，可乐商品进行促销------");
        IGood good = new ColaDiscountGood("可口可乐",77,5);
        ColaDiscountGood discountGood = (ColaDiscountGood) good;
        System.out.println("当前商品ID是:"+ discountGood.getGoodId() +",商品名称是:"+ discountGood.getGoodName() +",商品原价格是:" + discountGood.getOriginPrice() + ",商品打折后的价格是:" + discountGood.getGoodPrice());
    }
}
