package com.roumaysae.ASPECTS;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class SecondAspect {
    @Pointcut("execution(* com.roumaysae.TEST.Main.main(..))")
    public void pc1(){}

    @Around("pc1()")
    public void aroundMain(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("--------------------------------");
        System.out.println("Before main from Aspect2 with AspectJ syntax");
        System.out.println("--------------------------------");
        proceedingJoinPoint.proceed();
        System.out.println("--------------------------------");
        System.out.println("After main from Aspect2 with AspectJ syntax");
        System.out.println("--------------------------------");
    }
}
