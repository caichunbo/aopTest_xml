package com.cxb;

import com.cxb.service.impl.HelloWorldService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 测试
 * 基于注解配置AOP实现
 * @author 蔡小波
 */
public class HelloWorldTest {


    public static void main(String[] args) {

        //这个是application容器，所以就会去所有的已经加载的xml文件里面去找，包括jar包里面的xml文件
        ApplicationContext context=new FileSystemXmlApplicationContext("web/WEB-INF/applicationContext.xml");

        //通过ApplicationContext.getBean(beanName)动态加载数据（类）【获取Spring容器中已初始化的bean】。
        HelloWorldService helloWorld=(HelloWorldService) context.getBean("helloWorldService");

        //执行动态加载到的类的方法
        helloWorld.sayHello();



    }


}
