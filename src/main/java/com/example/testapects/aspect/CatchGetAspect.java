package com.example.testapects.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CatchGetAspect {

//    @Before("execution(* com.example.testapects.service.BankClientsService.getById(..))")
    @Around("@annotation(CatchAnnotation)")
    public void handle() {
        System.out.println("CatchAnnotation catch ");
    }
}
