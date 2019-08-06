package com.design.structural.facade;

public class FacadeBootStrap {

    public static void main(String[] args) {
        ShoppingTopService shoppingTopService = new ShoppingTopService();
        shoppingTopService.buy("9999");
    }
}
