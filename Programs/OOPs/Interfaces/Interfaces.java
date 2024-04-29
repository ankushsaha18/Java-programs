package OOPs.Interfaces;

public class Interfaces {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.Disk();
        obj.start();
        obj.stop();
        obj.Neutral();
    }
}
// Problem here is we cant separate for start and stop in engine and music
// for that follow InterfaceCar

class Car implements Engine, Brake, Media {
    public void Disk() {
        System.out.println("Disk breaks applied");
    }
    public void start() {
        System.out.println("Engine Start");
    }
    public void stop() {
        System.out.println("Engine stopped");
    }
    public void Neutral() {
        System.out.println("Car is in Neutral");
    }
}
