package com.braxgunn;
import java.time.Duration;
import java.time.Instant;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {

    @Around("execution(* com.braxgunn.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("[INFO]: " + joinPoint.getSignature().toString() + " executing");
        
        Instant start = Instant.now();
        
        joinPoint.proceed();
        
        Instant end = Instant.now();
        long timeElapsed = Duration.between(start, end).toMillis();
        
        System.out.println("[INFO]: Took " + timeElapsed + " milliseconds");

    }

}
