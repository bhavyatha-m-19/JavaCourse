package BasicMaths;

public class LCM {

    public static int findGCD(int a, int b){
        while(a > 0 && b > 0){
            if(a > b) a = a % b;
            else b = b % a;
        }
        return (a == 0) ? b : a;
    }

    public static int findLCM(int a, int b){
        int gcd = findGCD(a, b);
        return (a / gcd) * b;
    }

    public static void main(String[] args){
        int num1 = 4;
        int num2 = 6;

        System.out.println("lcm of the numbers is: " + findLCM(num1, num2));
    }
    
}
