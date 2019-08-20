package com.design.proxy.cglibproxy;

public class CGlibTest {

    public static void main(String[] args) {
        CGlibHelloWorldPoxy poxy = new CGlibHelloWorldPoxy();
        CGlibHelloWorld helloWorld = (CGlibHelloWorld) poxy.getProxy(CGlibHelloWorld.class);
        helloWorld.sayHello();
    }
}
