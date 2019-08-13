package com.design.structural.combination;

/**
 * 公共内容的抽象类
 */
public abstract class CatalogComponent {

    /**
     * 增加车型
     * @param carModel
     */
    public void addCarModel(CatalogComponent carModel) {
        throw new UnsupportedOperationException("不支持添加车型");
    }

    /**
     * 获取名称
     * @return
     */
    public String getName() {
        throw new UnsupportedOperationException("不支持获取名称");
    }


    /**
     * 获取价格
     * @return
     */
    public String getPrice() {
        throw new UnsupportedOperationException("不支持获取价格");
    }

    /**
     * 打印内容
     * @return
     */
    public void print() {
        throw new UnsupportedOperationException("不支持添加打印");
    }

}
