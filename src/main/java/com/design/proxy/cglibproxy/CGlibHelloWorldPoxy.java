package com.design.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGlibHelloWorldPoxy implements MethodInterceptor {

    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class clazz) {
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        beforeMethod(o.getClass().getSuperclass().getName(),method.getName());
        methodProxy.invokeSuper(o,objects);
        afterMethod(o.getClass().getSuperclass().getName(),method.getName());
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
