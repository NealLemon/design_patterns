package com.design.structural.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * BMW车型目录
 */
public class BMWCarCatalog extends CatalogComponent {

    List<CatalogComponent> bmwCars = new ArrayList<>();
    private String name;
    //层级
    private Integer level;

    public BMWCarCatalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void addCarModel(CatalogComponent carModel) {
        bmwCars.add(carModel);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void print() {
        /**
         * 为了打印目录结构好看做的优化
         */
        System.out.println(name);
        for (CatalogComponent bmwCar : bmwCars) {
            if(level != null) {
                for(int i = 0 ; i < level ; i++) {
                    System.out.print(" ");
                }
            }
            bmwCar.print();
        }
    }
}
