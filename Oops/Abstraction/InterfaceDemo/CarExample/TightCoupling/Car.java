package Oops.Abstraction.InterfaceDemo.CarExample.TightCoupling;

import Oops.Abstraction.InterfaceDemo.CarExample.InterfaceCar.Break;
import Oops.Abstraction.InterfaceDemo.CarExample.InterfaceCar.Engine;
import Oops.Abstraction.InterfaceDemo.CarExample.InterfaceCar.MediaPlayer;

// Why it is tight Coupling ??
public class Car implements Engine, Break ,MediaPlayer{

    @Override
    public void start() {
        System.out.println("...Start like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("...Stop like a normal car");
    }

    @Override
    public void acc() {
        System.out.println("...Accelerate like a normal car");


    }

    @Override
    public void brake() {
        System.out.println("...Break like a normal car");
    }


}
