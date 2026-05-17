package BasicMaths;

public class FindExtremes {

    public static int getLargestNumber(int n){
        if(n == 0){
            return 0;
        }

        if(n < 0){
            n = -n;
        }

        int maxDigit = 0;

        while(n != 0){
            int lastDigit = n % 10;
            if(maxDigit < lastDigit){
                maxDigit = lastDigit;
            }
            n = n/10; 
        }
        return maxDigit;
    }

    public static int getSmallestNumber(int n){
        if(n == 0){
            return 0;
        }
        if(n < 0){
            n = -n;
        }
        int minDigit = 9;
        while(n != 0){
            int lastDigit = n % 10;
            if(minDigit > lastDigit){
                minDigit = lastDigit;
            }
            n = n/10;
        }
        return minDigit;
    }

    public static void main(String[] args){
        int number = 4563;
        System.out.println("Larget digit is: " + getLargestNumber(number));
        System.out.println("Smallest digit is: " + getSmallestNumber(number));

    }
    
}
