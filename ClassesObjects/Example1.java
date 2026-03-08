//create simple class and object

package ClassesObjects;

class Example1 {

    //variables
    int a = 10;
    int b = 20;

    //method
    void display(){
        System.out.println("this is display function");
        System.out.println("A = " + a + ", B = " + b);
    }

    //main method
    public static void main(String[] args) {
        
        //objects should be created under main method
        Example1 ex = new Example1();

        //calling method
        ex.display();

    }
}
