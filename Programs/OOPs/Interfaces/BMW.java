package OOPs.Interfaces;

public class BMW {
    private Engine engine;
    private Media player = new MediaPlayer();
    public BMW(){
        engine = new DieselEngine();
    }
    void start(){
        engine.start();
    }
    void stop(){
        engine.stop();
    }
    void startMusic(){
        player.start();
    }
    void stopMusic(){
        player.stop();
    }
    void switchElectric(){
        engine = new ElectricEngine();
        engine.start();
    }
    void switchDiesel(){
        engine =  new DieselEngine();
        engine.start();
    }
}
