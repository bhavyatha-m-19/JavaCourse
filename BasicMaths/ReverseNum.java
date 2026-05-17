package BasicMaths;

public class ReverseNum {

    public static int reverse(int n)
    {
        int reverseNum = 0;

        while(n!=0){
            int lastDigit = n % 10;
            reverseNum = (reverseNum * 10) + lastDigit;
            n = n/10;
        }

        return reverseNum;
    }

    public static void main(String[] args)
    {
        int num1 = 2345;
        System.out.println("the reversed number of the number " + num1 + " is " + reverse(num1));
    }
    
}
