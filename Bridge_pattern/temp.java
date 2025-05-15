package Bridge_pattern;

public class temp {
    public static void main(String[] args) {
        Bus b = new Bus(new GasEngine());
        b.run();
        Truck t = new Truck(new ElectricEngine());
        t.run();
    }
}

class car{
    Engine e;
    public void run(){
        System.out.println("Car is running");
        e.start();
        e.stop();
    }
    public car(Engine e){
        this.e = e;
    }
}

abstract class Engine{
    abstract public void start();
    abstract public void stop();
}

class GasEngine extends Engine{
    @Override
    public void start() {
        System.out.println("Gas engine started");
    }
    @Override
    public void stop() {
        System.out.println("Gas engine stopped");
    }
}

class ElectricEngine extends Engine{
    @Override
    public void start() {
        System.out.println("Electric engine started");
    }
    @Override
    public void stop() {
        System.out.println("Electric engine stopped");
    }
}

class Bus extends car{
    public Bus(Engine e) {
        super(e);
    }
}

class Truck extends car{
    public Truck(Engine e) {
        super(e);
    }
}

