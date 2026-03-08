package OOPS;

class Employee{
    int id;
    String name;

    void work(){
        System.out.println("Employee is working");
    }
}

class Developer extends Employee{
    void code(){
        System.out.println("Developer writes code");
    }
}

class Tester extends Employee{
    void test(){
        System.out.println("Tests the code");
    }
}

class Manager extends Employee{
    void manage(){
        System.out.println("Manages the team");
    }
}

public class OverLoadingEx {
    public static void main(String[] args){
        Developer d = new Developer();
        d.id = 1;
        d.name = "Bhavyatha";

        d.work();
        d.code();

        Tester t = new Tester();
        t.id = 1;
        t.name = "Sahana";
        
    }
    
}
    

