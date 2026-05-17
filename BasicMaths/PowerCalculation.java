package BasicMaths;

public class PowerCalculation {

    public static double myPow(double base, int exponent) {
        // Use a long variable to safely handle Integer.MIN_VALUE without overflow
        long remainingPower = exponent;
        
        // If the exponent is negative, invert the base and make the power positive
        if (remainingPower < 0) {
            base = 1 / base;
            remainingPower = -remainingPower;
        }

        double result = 1.0;

        while (remainingPower > 0) {
            // Case 1: If the power is odd, multiply the result by the current base
            if (remainingPower % 2 == 1) {
                result = result * base;
                remainingPower = remainingPower - 1; // Drop by 1 to make it even
            } 
            // Case 2: If the power is even, square the base and cut the power in half
            else {
                base = base * base;             // Square the base
                remainingPower = remainingPower / 2; // Halve the power
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Test Case 1: Positive exponent
        double base1 = 2.0;
        int exp1 = 10;
        System.out.println(base1 + "^" + exp1 + " = " + myPow(base1, exp1)); // Expected: 1024.0

        // Test Case 2: Negative exponent
        double base2 = 2.0;
        int exp2 = -2;
        System.out.println(base2 + "^" + exp2 + " = " + myPow(base2, exp2)); // Expected: 0.25
    }
}