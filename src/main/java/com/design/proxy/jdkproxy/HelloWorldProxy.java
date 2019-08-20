package com.design.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class HelloWorldProxy implements InvocationHandler {
    //代理的目标类
    private Object target;

    public HelloWorldProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeMethod(proxy.getClass().getName(),method.getName());
        method.invoke(target,args);
        afterMethod(proxy.getClass().getName(),method.getName());
        return null;
    }

    /**
     * 调用前执行的方法
     * @param clazz
     * @param methodName
     */
    private void beforeMethod(String clazz,String methodName) {
        System.out.println("在 类: "+ clazz +"的方法:"+methodName+"前执行");
    }

    /**
     * 调用后执行的方法
     * @param clazz
     * @param methodName
     */
    private void afterMethod(String clazz,String methodName) {
        System.out.println("在 类: "+ clazz +"的方法:"+methodName+"后执行");
    }
}
