package Oops.Abstraction.InterfaceDemo.CarExample.LooseCoupling;

import Oops.Abstraction.InterfaceDemo.CarExample.InterfaceCar.Engine;

public class ElectricEngine implements Engine {
    
     @Override
    public void acc() {
        System.out.println("Electric Engine Accelerate...");
        
    }
    
    @Override
    public void start() {
        System.out.println("Electric Engine start...");
    }
    
    @Override
    public void stop() {
        System.out.println("Electric Engine Stop...");
    }
}
