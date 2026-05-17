package BasicMaths;

public class GCD {

    public static int findGCD(int a, int b){
        while(a > 0 && b > 0){
            if(a > b){
                a = a % b;
            }
            else{
                b = b % a;
            }
        }

        if(a == 0){
            return b;
        }else{
            return a;
        }
        //can be written as => return (a == 0) ? b : a;
    }

    public static void main(String[] args) {

        int num1 = 12, num2 = 18;
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + findGCD(num1, num2)); // Expected: 6

        int num3 = 7, num4 = 15;
        System.out.println("GCD of " + num3 + " and " + num4 + " is: " + findGCD(num3, num4)); // Expected: 1

        int num5 = 56, num6 = 98;
        System.out.println("GCD of " + num5 + " and " + num6 + " is: " + findGCD(num5, num6)); // Expected: 14
    }
    
}
