package com.strategy.demostrategy.demo;

/**
 * 返现促销
 */
public class ReturnSaleActivity implements SaleActivity{
    @Override
    public String sale() {
        return "返现促销";
    }
}
