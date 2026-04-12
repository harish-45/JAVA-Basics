package Oops.Abstraction.InterfaceDemo.CarExample.LooseCoupling;

import Oops.Abstraction.InterfaceDemo.CarExample.InterfaceCar.Engine;
import Oops.Abstraction.InterfaceDemo.CarExample.InterfaceCar.MediaPlayer;

public class NiceCar {
    private Engine engine;
    private MediaPlayer player = new CDplayer();

    public NiceCar() {
        this.engine = new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void upgradeEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void acc() {
        engine.acc();
    }

    public void playMusic() {
        player.start();
    }

    public void pauseMusic() {
        player.stop();
    }

}
