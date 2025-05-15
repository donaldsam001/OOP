
public class Wine extends Beverage {
    float ABV;

    public  Wine(String b, float a) {
        super(b);
        this.ABV= a;
    }

    public  void display(){
        System.out.println(brand+ABV);
    }
}