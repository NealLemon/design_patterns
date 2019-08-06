package com.design.structural.facade;

/**
 * 上层服务
 */
public class ShoppingTopService {
    private DeliveryService deliveryService;
    private PayService payService;
    private StockService stockService;
    /**
     * 模拟pring 构造注入
     */
    public ShoppingTopService() {
        this.deliveryService = new DeliveryService();
        this.payService = new PayService();
        this.stockService = new StockService();
    }

    public void buy(String serNo) {
        if(stockService.haveStock(serNo)) {   //检查库存
            if(payService.pay("10000")) { //付款
                if(stockService.reduce(serNo)) {  //扣库存
                    String deliveryId = deliveryService.isDelivery(serNo); //物流服务
                    System.out.println("交易完成，发货完成,物流号： " + deliveryId);
                }
            }
        }
    }
}
