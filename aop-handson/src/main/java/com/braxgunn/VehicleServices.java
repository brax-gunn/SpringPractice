package com.braxgunn;

import org.springframework.stereotype.Component;

@Component
public class VehicleServices {
    
    @ConnectivityAspectInf
    public void startVehicle(){
        System.out.println("[VEHICLE]: Engine started, vehicle is ready to move.");
    }

    public void moveVehicle(){
        System.out.println("[VEHICLE]: Vehicle is moving");
    }
    
    public void stopVehicle(){
        System.out.println("[VEHICLE]: Applied brake, vehicle has stopped.");
    }

}
