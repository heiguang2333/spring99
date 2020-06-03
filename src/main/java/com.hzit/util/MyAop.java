package com.hzit.util;

import com.hzit.model.Person;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 切面
 * */
@Aspect
@Component
public class MyAop {
    /**
     * 定义一个切入点
     */
    @Pointcut("execution(* com.hzit.service.*.*(..))")
    public void anyMethod() {

    }
    /**
     * 定义一个通知
     *
     * */
    @Before("anyMethod()")
    public void beforeMethod(){
        System.out.println("任何函数前都加：前林狗");
    }
    @After("anyMethod()")
    public void after(){
        System.out.println("任何函数后都加：后");
    }
    @After("anyMethod() && args(person)")
    public void afterper(Person person){
        System.out.println("在参数是people的函数后加：后");
    }
    @After("anyMethod() && args(name)")
    public void aftername(String name){
        System.out.println("在参数是name的函数后加：后");
    }

    @AfterReturning("anyMethod()")
    public void aftertryutn(){
        System.out.println("在有return之后加：后");
    }
    @AfterThrowing("anyMethod()")
    public void doAfterThrow() {
        System.out.println("例外通知");
    }
    @Around("anyMethod()")
    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("进入环绕通知");
        Object object = pjp.proceed();// 执行该方法
        System.out.println("退出环绕通知");
        return object;
    }

//@After("anyMethod()")
//    public void aftertt(JoinPoint point){
//
//}

}