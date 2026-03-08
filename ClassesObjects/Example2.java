// using static class - Single file java

package ClassesObjects;

public class Example2 {

    //static class definition
    static class Student{
        int id;
        String name;
        int age;

        void display(){
            System.out.println("ID: " + id);
            System.out.println("NAME: " + name);
            System.out.println("AGE: " + age);
        }
    }

    public static void main(String[] args){
        Student s1 = new Student();

        s1.id = 1;
        s1.name = "Bhavyatha";
        s1.age = 23;

        s1.display();

        Student s2 = new Student();

        s2.id = 2;
        s2.name = "Sinchana";
        s2.age = 25;

        s2.display();
    }
}
