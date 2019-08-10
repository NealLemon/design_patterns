package com.design.structural.adapter.demo;

/**
 * 将Type-c 输出源转换为 3.5mm手机输出源
 */
public class Adapter implements ThreePointFive{

    private TypeCPhone typeCPhone = new TypeCPhone();

    public Adapter() {
        System.out.println("获取Type-C 输出源 ");
    }

    @Override
    public void requireOutputMusic() {
        typeCPhone.outputMusic();
        System.out.println("Type-C 输出源开始转换为3.5mm 输出源");

    }
}
