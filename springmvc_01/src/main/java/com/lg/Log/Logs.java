package com.lg.Log;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//aop实例
@Aspect
@Component
public class Logs {
    private final static Logger LOGGER= LoggerFactory.getLogger(Logs.class);
    //前置增强，符合切点要求的方法执行下列方法
    @Before("execution(* com.lg.controller..*(..))")
    public void before(JoinPoint joinPoint ){
        System.out.println("--------------");
        System.out.println("调用"+joinPoint.getSignature());
        System.out.println("--------------");

    }
    //后置增强，在方法返回数据之后执行的方法
    @AfterReturning(value = "execution(* com.lg.controller..*(..))",returning = "returnValue")
    public void afterReturn(JoinPoint joinPoint ,Object returnValue){
        System.out.println("--------------");
        System.out.println(joinPoint.getSignature()+"调用完成，返回值为："+returnValue);
        System.out.println("--------------");
    }

}
