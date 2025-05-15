public class Bottle {
    Beverage beverage;
    float volume;
    public Bottle() {
    }
    public Bottle(Beverage beverage,float volume)
    {
        this.beverage = beverage;
        this.volume=volume;
    }

    public void show(){
        this.beverage.display();
        System.out.println(volume);
    }
}
