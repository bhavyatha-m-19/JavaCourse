package BasicMaths;

public class PowerCalculation {

    public static double myPow(double x, int n) {
        // Use a long variable to safely handle Integer.MIN_VALUE without overflow
        long nn = n;
        
        // If the exponent is negative, convert it to positive 
        // and invert the base (e.g., 2^-2 becomes (1/2)^2)
        if (nn < 0) {
            x = 1 / x;
            nn = -nn;
        }

        double result = 1.0;

        while (nn > 0) {
            // If the power is odd
            if (nn % 2 == 1) {
                result = result * x;
                nn = nn - 1; // Reduce power to make it even
            } 
            // If the power is even
            else {
                x = x * x;   // Square the base
                nn = nn / 2; // Cut the power in half
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Test Case 1: Standard positive exponent
        double x1 = 2.0;
        int n1 = 10;
        System.out.println(x1 + "^" + n1 + " = " + myPow(x1, n1)); // Expected: 1024.0

        // Test Case 2: Negative exponent
        double x2 = 2.0;
        int n2 = -2;
        System.out.println(x2 + "^" + n2 + " = " + myPow(x2, n2)); // Expected: 0.25

        // Test Case 3: Exponent is 0
        double x3 = 5.5;
        int n3 = 0;
        System.out.println(x3 + "^" + n3 + " = " + myPow(x3, n3)); // Expected: 1.0
    }
}
