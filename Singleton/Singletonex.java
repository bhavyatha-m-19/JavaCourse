package Singleton;

class Singleton {

    // Step 1: create single object
    private static Singleton instance = new Singleton();

    // Step 2: private constructor (no outside object creation)
    private Singleton() {
        System.out.println("Singleton object created");
    }

    // Step 3: public method to access object
    public static Singleton getInstance() {
        return instance;
    }
}

public class Singletonex {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2);  // true (same object)
    }
}
