package com.design.proxy.jdkproxy;

public class HelloWorldImpl implements HelloWorld {
    @Override
    public void sayHello() {
        System.out.println("Hello World~");
    }
}
