package com.cxb.aop;

/**
 * 切面
 * @author 蔡小波
 */
public class HelloWorldAspect {

    /**
     * 前置通知
     */
    public void beforeAdvice(){

        System.out.println("———前置通知(即先执行这里）———");

    }



}
