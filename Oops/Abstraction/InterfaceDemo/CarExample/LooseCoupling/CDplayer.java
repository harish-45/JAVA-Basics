package Oops.Abstraction.InterfaceDemo.CarExample.LooseCoupling;


import Oops.Abstraction.InterfaceDemo.CarExample.InterfaceCar.MediaPlayer;

public class CDplayer implements MediaPlayer{

    @Override
    public void start() {
        System.out.println("Music is playing...");
    }

    @Override
    public void stop() {
        System.out.println("Music is paused...");
        
    }
    
}
