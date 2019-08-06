package com.design.structural.facade;

/**
 * 付款服务
 */
public class PayService {

    /**
     * 付款服务
     * @param money  付款钱数
     * @return
     */
    public boolean pay(String money) {
        System.out.println("成功支付:" + money + "元");
        return true;
    }
}
