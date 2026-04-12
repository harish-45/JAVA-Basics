package Oops.Abstraction.InterfaceDemo.CarExample.LooseCoupling;

import Oops.Abstraction.InterfaceDemo.CarExample.InterfaceCar.Engine;

public class PowerEngine implements Engine{

    @Override
    public void acc() {
        System.out.println("Power Engine Accelerate...");
        
    }
    
    @Override
    public void start() {
        System.out.println("Power Engine start...");
    }
    
    @Override
    public void stop() {
        System.out.println("Power Engine Stop...");
    }
    
}
