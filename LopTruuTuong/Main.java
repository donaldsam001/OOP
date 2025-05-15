package LopTruuTuong;

public class Main  {
    public static void main(String[] args) {
        Director director = new Director();
        Employee employee = new Employee("Sam", 101, "CS");
        director.addMember(employee);
    }
}

// LỚP TRỪU TƯỢNG
abstract class Organization {
    private String name;
    public abstract void display();
}

class Employee{
    String name;
    int id;
    String role;

    public Employee(String name, int id, String role) {
        this.name = name;
        this.id = id;
        this.role = role;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

// LỚP GIAO DIỆN
interface ManagementAction {
    public void meeting();
    public void addMember(Employee e);
    public void
    removeMember(Employee e);
}

class Director extends Organization implements ManagementAction {
    Employee members[];
    public void display() {
        System.out.println("display...");
    }
    public void meeting() {
        System.out.println("meeting...");
    }
    public void addMember(Employee e) {System.out.println("add member...");}
    public void removeMember(Employee e) {System.out.println("delete member...");}

}