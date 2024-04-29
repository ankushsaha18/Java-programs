package OOPs.Interfaces;

public class DieselEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Diesel Engine Start");
    }

    @Override
    public void stop() {
        System.out.println("Diesel Engine Stop");
    }

    @Override
    public void Neutral() {
        System.out.println("Diesel Engine in neutral gear");
    }
}
