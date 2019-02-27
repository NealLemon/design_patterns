package com.principle.openclose;

/**
 * @ClassName ColaDiscountGood
 * @Description 打折商品类
 * @Author Neal
 * @Date 2019/2/26 20:23
 * @Version 1.0
 */
public class ColaDiscountGood extends ColaGood{

    public ColaDiscountGood(String goodName, int goodId, int goodPrice) {
        super(goodName, goodId, goodPrice);
    }


    /**
     * 获取原价
     * @return
     */
    public int getOriginPrice() {
        return super.getGoodPrice();
    }


    @Override
    public int getGoodPrice() {
        return (int) (super.getGoodPrice() * 0.6);
    }
}
