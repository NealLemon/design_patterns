package com.strategy.demostrategy.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/sale")
public class SaleController {

    /**
     * 依赖查找
     */
    @Autowired
    private Map<String,SaleActivity> saleActivityMap;

    /**
     * 应用层选择某一促销策略
     * @param saletype
     * @return
     */
    @GetMapping("/{saletype}")
    public String goShopping(@PathVariable("saletype") String saletype) {
        SaleActivity saleActivity = saleActivityMap.get(saletype);
        return saleActivity.sale();
    }
}
