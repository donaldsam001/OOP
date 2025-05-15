public class SoftDrink extends  Beverage{
    float sugar;

    public  SoftDrink(String b, float s){
        super(b);
        this.sugar=s;
    }

    public void display(){
        System.out.println(brand+ sugar);
    }
}
