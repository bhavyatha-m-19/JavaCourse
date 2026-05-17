package BasicMaths;

public class ArmstrongNumber {

    //count digits
    public static int countDigits(int n){
        if(n == 0){
            return 1;
        }
        int count = 0;
        while(n != 0){
            n = n/10;
            count++;
        }
        return count;
    }

    //Armstrong
    public static boolean isArmstrong(int n){
        if(n < 0){
            return false;
        }

        int originalNum = n;
        int numberOfDigits = countDigits(n);
        int sum = 0;

        while(n != 0){
            int lastDigit = n % 10;
            sum += Math.pow(lastDigit, numberOfDigits);
            n = n/10;
        }
        return sum == originalNum;
    }

    public static void main(String[] args){
        int number = 153;
        System.out.println("is the number " + number + " Armstrong? " + isArmstrong(number));
    }
    
}
