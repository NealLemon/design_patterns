package com.strategy.demostrategy.demo;

/**
 * 返现促销
 */
public class ReduceSaleActivity implements SaleActivity {
    @Override
    public String sale() {
        return "满减促销";
    }
}
