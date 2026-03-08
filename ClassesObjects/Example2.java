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


// Why Static?
// Because class Student is inside another class (Example2).
// Static class Student is only valid inside another class.
// You cannot write static class Student at top level. at that time class should be made public.
// In java, a class inside another class is called a nested class.
// When we make it static, it means: The inner class DOES NOT need an object of Example2 class to be created.