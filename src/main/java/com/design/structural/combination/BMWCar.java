package com.design.structural.combination;

/**
 * 车型类
 */
public class BMWCar extends CatalogComponent {

    private String name;
    private String price;
    //年份
    private String year;
    //层级
    private Integer level;

    public BMWCar(String name, String price, String year, Integer level) {
        this.name = name;
        this.price = price;
        this.year = year;
        this.level = level;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getPrice() {
        return this.price;
    }

    @Override
    public void print() {
        if(level != null) {
            for(int i = 0 ; i < level ; i++) {
                System.out.print(" ");
            }
        }
        System.out.println(year + "年款， 车型名称：" + name + "，价格为："+ price);
    }
}
