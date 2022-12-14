package com.braxgunn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public final class App {

    public static void main(String[] args) {
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);    

        VehicleServices vServices = context.getBean(VehicleServices.class);

        System.out.println("VechicleServices Proxy Class: " +  vServices.getClass());
        
        vServices.startVehicle();
        vServices.moveVehicle();
        vServices.stopVehicle();

        context.close();

    }
}
