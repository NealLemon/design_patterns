package com.principle.openclose;

/**
 * @InterfaceName IGood
 * @Description 商品抽象接口
 * @Author Neal
 * @Date 2019/2/26 20:14
 * @Version 1.0
 */
public interface IGood {
    //获取商品名称
    String getGoodName();
    //获取商品ID
    int getGoodId();
    //获取商品价格
    int getGoodPrice();
}
