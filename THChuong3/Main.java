public class Main {
    public static void main(String[] args) {
        Beverage b= new Beverage() {
            @Override
            public void display() {

            }
        }
        Wine w= new Wine("Vodka", 40.5f);
        SoftDrink c= new SoftDrink("Pepsi", 20);
        Bottle b75= new Bottle(b,20);
    }
}