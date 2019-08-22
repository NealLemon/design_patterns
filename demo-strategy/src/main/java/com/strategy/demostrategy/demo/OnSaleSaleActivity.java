package com.strategy.demostrategy.demo;

/**
 * 打折促销实现类
 */
public class OnSaleSaleActivity implements SaleActivity{
    @Override
    public String sale() {
        return "打折促销";
    }
}
