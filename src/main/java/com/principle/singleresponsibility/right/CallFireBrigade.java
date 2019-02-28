package com.principle.singleresponsibility.right;

/**
 * @ClassName CallFireBrigade
 * @Description 火警
 * @Author Neal
 * @Date 2019/2/28 16:31
 * @Version 1.0
 */
public class CallFireBrigade implements ICall {

    public void call() {
        System.out.println("拨打火警电话");
    }
}
