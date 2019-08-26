package com.design.behavioral.strategy;

public class ReduceSaleActivity implements SaleActivity {
    @Override
    public String sale() {
        return "满减促销";
    }
}
