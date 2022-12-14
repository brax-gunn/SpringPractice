package com.braxgunn;

import java.time.Duration;
import java.time.Instant;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ConnectivityAspect {

    @Around("@annotation(com.braxgunn.ConnectivityAspectInf)")
    public void checkConn(ProceedingJoinPoint  joinPoint) throws Throwable{
        System.out.println("[CONNECTIVITY]: You are connected to the system");
        Instant start = Instant.now();
        
        joinPoint.proceed();
        
        Instant end = Instant.now();
        long timeElapsed = Duration.between(start, end).toMillis();
        
        System.out.println("[INFO]: Took " + timeElapsed + " milliseconds");
    }
    
}
