package com.principle.openclose;

/**
 * @ClassName ColaGood
 * @Description 可乐商品
 * @Author Neal
 * @Date 2019/2/26 20:18
 * @Version 1.0
 */
public class ColaGood implements IGood{

    //商品名称
    private String goodName;

    //商品ID
    private int goodId;

    //商品价格
    private int goodPrice;

    public ColaGood(String goodName, int goodId, int goodPrice) {
        this.goodName = goodName;
        this.goodId = goodId;
        this.goodPrice = goodPrice;
    }

    public String getGoodName() {
        return this.goodName;
    }

    public int getGoodId() {
        return this.goodId;
    }

    public int getGoodPrice() {
        return this.goodPrice;
    }
}
