package com.design.behavioral.strategy;

public class ReturnSaleActivity implements SaleActivity{
    @Override
    public String sale() {
        return "返现促销";
    }
}
