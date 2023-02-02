package com.muhammederendemir.springbootlogstash.aop;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger log = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.muhammederendemir.springbootlogstash.service.*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        log.info("Entering method {} with arguments {}", joinPoint.getSignature().getName(), joinPoint.getArgs());
    }

    @After("execution(* com.muhammederendemir.springbootlogstash.service.*.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        log.info("Exiting method {}", joinPoint.getSignature().getName());
    }
}