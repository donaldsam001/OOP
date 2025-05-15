abstract class Beverage {
    String brand;
    public Beverage() {
    }
    public Beverage(String brand) {
        this.brand = brand;
    }
    abstract public void display();
}
