package com.design.proxy.jdkproxy;

import java.lang.reflect.Proxy;

public class JdkProxyTest {
    public static void main(String[] args) {
        //目标类声明
        HelloWorld helloWorld = new HelloWorldImpl();

        //代理类声明
        HelloWorldProxy helloWorldProxy = new HelloWorldProxy(helloWorld);
        //通过接口实现代理目标类的实例
        HelloWorld proxyHelloWorld = (HelloWorld) Proxy.newProxyInstance(
                helloWorld.getClass().getClassLoader(),
                helloWorld.getClass().getInterfaces(),
                helloWorldProxy
        );
        //调用方法
        proxyHelloWorld.sayHello();
    }
}
