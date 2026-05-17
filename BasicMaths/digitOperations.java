package BasicMaths;

public class digitOperations {

    public static int getSumOfDigits(int n){
        if(n<0){
            n = -n;
        }

        int sum =0;

        while(n != 0){
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n = n/10;    
        }
        return sum;
    }

    public static int getProdOfDigits(int n){
        if(n == 0){
            return 0;
        }

        if(n < 0){
            n = -n;
        }

        int product = 1;
        while(n != 0){
            int lastDigit = n % 10;
            product = product * lastDigit;
            n = n/10;
        }
        return product;
    }

    public static void main(String[] args){
        int number = 1234;
        System.out.println("sum of digits: " + getSumOfDigits(number));
        System.out.println("product of digits: " + getProdOfDigits(number));
    }
    
}
