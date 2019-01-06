package com.cxb.service.impl;


import com.cxb.service.IHelloWorldService;

/**
 * 接口实现
 * @author 蔡小波
 */
public class HelloWorldService implements IHelloWorldService {

    @Override
    public void sayHello() {
        System.out.println("你好！Spring AOP——（即这个为主要业务）");
    }

}
