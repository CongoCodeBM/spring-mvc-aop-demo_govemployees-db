package com.congocode.springboot.thymeleafdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class DemoLoggingAspect
{
    // setup logger
    private Logger myLogger = Logger.getLogger(getClass().getName());

    //setup pointcut declarations
    @Pointcut("execution(* com.congocode.springboot.thymeleafdemo.controller.*.*(..))")
    private void pointCutForControllerPackage(){}

    @Pointcut("execution(* com.congocode.springboot.thymeleafdemo.service.*.*(..))")
    private void pointCutForServicePackage(){}

    @Pointcut("execution(* com.congocode.springboot.thymeleafdemo.dao.*.*(..))")
    private void pointCutForDaoPackage(){}

    @Pointcut("pointCutForControllerPackage() || pointCutForServicePackage() || pointCutForDaoPackage()")
    private void pointCutForAppFlow() {}

    // add @Before advice
    @Before("pointCutForAppFlow()")
    public void beforeAdvice(JoinPoint theJoinPoint)
    {
        //display method we are calling
        String theMethod = theJoinPoint.getSignature().toShortString();
        myLogger.info("=====> In @Before: calling method: " + theMethod);

        //display the arguments to the method

        //get the arguments
        Object[] args = theJoinPoint.getArgs();

        // loop through and display the arguments
        for(Object tempArg : args)
        {
            myLogger.info("=======> argument: " + tempArg);
        }
    }

    @AfterReturning(pointcut = "pointCutForAppFlow()", returning = "theObjectResult")
    public void afterReturning(JoinPoint theJoinPoint, Object theObjectResult)
    {
        //display method we are returning from
        String theMethod = theJoinPoint.getSignature().toShortString();
        myLogger.info("=====> In @AfterReturning: calling method: " + theMethod);

        //display data returned
        myLogger.info("=======> result: " + theObjectResult);
    }

}
