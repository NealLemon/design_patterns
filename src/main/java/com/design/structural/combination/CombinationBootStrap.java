package com.design.structural.combination;

public class CombinationBootStrap {

    public static void main(String[] args) {
        //创建国产宝马
        CatalogComponent madeInChina = new BMWCarCatalog("国产宝马",1);
        //创建进口宝马
        CatalogComponent importBMW= new BMWCarCatalog("进口宝马",1);
        /**
         * 创建国产车系
         */
        //1系目录
        CatalogComponent oneEr = new BMWCarCatalog("1系",2);
        //3系目录
        CatalogComponent threeEr = new BMWCarCatalog("3系",2);
        //5系目录
        CatalogComponent fiveEr = new BMWCarCatalog("5系",2);
        /**
         * 创建进口车系
         */
        CatalogComponent sevenEr = new BMWCarCatalog("7系",2);
        /**
         * 创建车型
         */
        //一系
        CatalogComponent oneEr1 = new BMWCar("118i 时尚型","19.88万","2019年",3);
        CatalogComponent oneEr2 = new BMWCar("120i 领先型M运动套装","24.38万","2018年",3);
        oneEr.addCarModel(oneEr1);
        oneEr.addCarModel(oneEr2);
        //三系
        CatalogComponent threeEr1 = new BMWCar("325i M运动套装","31.39万 ","2020年",3);
        CatalogComponent threeEr2 = new BMWCar("320Li 时尚型 ","29.68万起","2019年",3);
        threeEr.addCarModel(threeEr1);
        threeEr.addCarModel(threeEr2);
        //五系
        CatalogComponent fiveEr1 = new BMWCar("525Li 豪华套装","42.69万 ","2019年",3);
        CatalogComponent fiveEr2 = new BMWCar("530Li 领先型 M运动套装 ","46.39万","2019年",3);
        fiveEr.addCarModel(fiveEr1);
        fiveEr.addCarModel(fiveEr2);
        //添加进国产宝马目录
        madeInChina.addCarModel(oneEr);
        madeInChina.addCarModel(threeEr);
        madeInChina.addCarModel(fiveEr);

        //七系
        CatalogComponent sevenEr1 = new BMWCar("730Li 豪华套装","82.80万 ","2019年",3);
        CatalogComponent sevenEr2 = new BMWCar("740Li 尊享型 M运动套装 ","106.80万 ","2019年",3);
        sevenEr.addCarModel(sevenEr1);
        sevenEr.addCarModel(sevenEr2);
        //添加进口车车系目录
        importBMW.addCarModel(sevenEr);

        /**
         * 创建宝马
         */
        CatalogComponent bmw = new BMWCarCatalog("宝马汽车",null);
        bmw.addCarModel(madeInChina);
        bmw.addCarModel(importBMW);
        bmw.print();
    }
}
