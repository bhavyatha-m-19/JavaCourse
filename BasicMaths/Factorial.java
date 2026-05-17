package BasicMaths;

public class Factorial {

    // Using 'long' as the return type to safely handle up to n = 20

    public static long calculateFactorial(int n) {

        // Edge case
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        long factorial = 1; // Must initialize to 1 for multiplication

        // Loop from 1 up to n to accumulate the product
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }

    public static void main(String[] args) {
       
        int num1 = 5;
        System.out.println(num1 + "! = " + calculateFactorial(num1)); // Expected: 120

        int num2 = 0;
        System.out.println(num2 + "! = " + calculateFactorial(num2)); // Expected: 1

        int num3 = 15;
        System.out.println(num3 + "! = " + calculateFactorial(num3)); // Expected: 1307674368000
    }
}
