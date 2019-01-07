package com.cxb.service.impl;


import com.cxb.service.IHelloWorldService;
import org.springframework.stereotype.Component;

/**
 * 接口实现
 * @author 蔡小波
 */

//将实现类加入Spring的IOC容器进行管理（业务组件）
@Component("helloWorldService")
public class HelloWorldService implements IHelloWorldService {

    @Override
    public void sayHello() {
        System.out.println("你好！Spring AOP——（即这个为主要业务）");
    }

}
