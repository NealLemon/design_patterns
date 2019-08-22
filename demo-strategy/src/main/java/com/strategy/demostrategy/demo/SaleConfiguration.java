package com.strategy.demostrategy.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 声明spring Bean
 */
@Configuration
public class SaleConfiguration {

    @Bean
    public OnSaleSaleActivity onSale() {
        return new OnSaleSaleActivity();
    }

    @Bean
    public ReduceSaleActivity reduceSale() {
        return new ReduceSaleActivity();
    }

    @Bean
    public ReduceSaleActivity returnSale() {
        return new ReduceSaleActivity();
    }

}
