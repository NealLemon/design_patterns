package com.principle.singleresponsibility.right;

/**
 * @ClassName CallPolice
 * @Description 报警
 * @Author Neal
 * @Date 2019/2/28 16:29
 * @Version 1.0
 */
public class CallPolice implements ICall {

    public void call() {
        System.out.println("拨打报警电话");
    }
}
