 class Employee {
    public int id = 10;
    public String name = "Hasib";

    public void display() {
        System.out.println("DONE!");
    }
}

class HR extends Employee {
    protected double salary = 100000;

    public void display() {
        System.out.println("print from my HR!");
        System.out.println(salary);
    }
    public void ManageEmployee() {
        System.out.println("print from ManageEmployee!");
       // System.out.println(salary);
    }
}

class SoftwareEngineer extends Employee {
    protected double salary = 52500000;

    public void developCode() {
        System.out.println("print from my developCode!");
        System.out.println(salary);
    }
}

public class Lavb4_13_2_2025 {
    public static void main(String[] args) {
        HR myHr = new HR();
        myHr.display();
        myHr.ManageEmployee();

        SoftwareEngineer s1 = new SoftwareEngineer();
        s1.display();
        s1.developCode();
    }
}
