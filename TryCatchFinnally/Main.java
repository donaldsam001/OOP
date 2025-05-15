package TryCatchFinnally;

public class Main {
    public static void main(String[] args) {
//      Bamboo
        House<Bamboo> bambooHouse = new House<>(new Bamboo());
        bambooHouse.showTree();

//      Corn
        House<Corn> cornHouse = new House<>(new Corn());
        cornHouse.showTree();

        try {
            bambooHouse.riskyMethod();
            cornHouse.riskyMethod();
        }
        catch (Exception e){
            System.out.println("Caught exception: "+ e.getMessage());
        }
    }
}

//  LỚP TRỪU TƯỢNG
abstract class Tree {
    abstract void grow();
}

//  LỚP DẪN XUẤT
class Bamboo extends Tree {
    @Override
    public void grow(){
        System.out.println("Bamboo is growing.");
    }
}

//  LỚP DẪN XUẤT
class Corn extends Tree{
    @Override
    public void grow(){
        System.out.println("Corn is growing.");
    }
}

//  LỚP GENERIC
class House <T extends Tree>{
    private T tree;

public House(T tree){
    this.tree = tree;
}

public void showTree(){
    tree.grow();
}
public void riskyMethod() throws Exception{
    throw new Exception("Something went wrong in House.");
}
}