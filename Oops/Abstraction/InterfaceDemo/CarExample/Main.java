package Oops.Abstraction.InterfaceDemo.CarExample;

import Oops.Abstraction.InterfaceDemo.CarExample.LooseCoupling.ElectricEngine;
import Oops.Abstraction.InterfaceDemo.CarExample.LooseCoupling.NiceCar;
import Oops.Abstraction.InterfaceDemo.CarExample.TightCoupling.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.acc();
        car.stop();
        car.brake();


        System.out.println("\n ----- New car -----\n");

        NiceCar newCar = new NiceCar();

        newCar.start();
        newCar.acc();
        newCar.stop();
        newCar.playMusic();
        newCar.pauseMusic();
        newCar.upgradeEngine(new ElectricEngine());
        System.out.println("\n----- After uprgade ----- \n");
        newCar.start();
        newCar.acc();
        newCar.stop();



    }

}
