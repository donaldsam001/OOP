package This;

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Student s=new Student("An");
        s.getInstance().display();
        s.makeCopy().display();
    }
}

class Student{
    int id;
    String name;
    public Student(int id,String
            name){
        this.id=id;
        this.name=name;
    }
    public Student(String name){
        this(0,name);
    }
    public Student(Student s){
        this.id=s.id;
        this.name=s.name;
    }

    public Student getInstance(){return this;
    }
    public Student makeCopy(){
        Student s=new Student(this);
        return s;
    }
    public void display(){System.out.println(this.id+" "+this.name);
    }
}