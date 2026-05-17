package BasicMaths;

public class PrimeCheck {

    public static boolean isPrime(int n){
        if(n < 0){
            return false;
        }
        for(int i = 2; i*i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int num1 = 17;
        System.out.println("is the number " + num1 + " prime? " + isPrime(num1));

        int num2 = 14;
        System.out.println("is the number " + num2 + " prime? " + isPrime(num2));
    }
    
}
