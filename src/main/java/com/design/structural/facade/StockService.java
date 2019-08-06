package com.design.structural.facade;

/**
 * 库存服务
 */
public class StockService {

    /**
     * 检查是否有库存
     * @param serNo  商品序列号
     * @return
     */
    public boolean haveStock(String serNo) {
        System.out.println("检查商品系列号为：" + serNo +"的商品是否有货");
        return true;
    }

    public boolean reduce(String serNo) {
        System.out.println("扣库存，商品号为:" + serNo);
        return true;
    }
}
