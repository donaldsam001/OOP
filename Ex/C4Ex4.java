package Ex;

public class C4Ex4 {
    public static void main(String[] args) {
        try{
            Student s1 = new Student("Hihi" , 2005);
            s1.getAge(2025);
            s1.setName("");
        }
        catch (NegativeAgeException e){
            e.printStackTrace();
        }
        catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }
}

class NegativeAgeException extends Exception{
    public String getMessage(){
        return "Current year can not be less than birthyear";
    }
}
class Student{
    String name;
    int birthyear;//năm sinh
    public Student() {
    }
    public Student(String name, int birthyear) {
        this.name = name;
        this. birthyear = birthyear;
    }
    public int getAge(int year) throws NegativeAgeException{
        if (year < birthyear){
            throw new NegativeAgeException();
        }
        return (year-birthyear);
    }

    public void setName(String name) throws IllegalArgumentException{
        if (name == null ){
            throw new IllegalArgumentException();
        }
        this.name = name;
    }
}

