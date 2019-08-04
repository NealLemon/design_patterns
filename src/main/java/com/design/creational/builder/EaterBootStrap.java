package com.design.creational.builder;

public class EaterBootStrap {

    public static void main(String[] args) {

        //去肯德基吃饭
        Eater kfc = new Eater.EaterBuilder().
                builderOrder("肯德基点餐").builerMode(EatMode.HERE).
                builerPay("结账:100 RMB").builerEat("吃吃吃").build();

        System.out.println("肯德基就餐:" + kfc.toString());
        //去饭店吃饭
        Eater restaurant = new Eater.EaterBuilder().
                builderOrder("饭店点餐").builerMode(EatMode.HERE).
                builerEat("吃吃吃").builerPay("结账: 89 RMB").builderPack("打包剩菜").build();

        System.out.println("饭店就餐:" + restaurant.toString());
    }
}
