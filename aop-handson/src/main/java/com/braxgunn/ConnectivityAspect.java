package com.braxgunn;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ConnectivityAspect {

    @Around("@annotation(com.braxgunn.ConnectivityAspectInf)")
    public void checkConn(){
        System.out.println("[CONNECTIVITY]: You are connected to the system");
    }
    
}
