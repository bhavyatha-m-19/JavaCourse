package BasicMaths;

public class PalindromeNumber {

    public static boolean isPalindrome(int n){

        if(n < 0){
            return false;
        }

        int originalNum = n;
        int reverseNum = 0;

        while(n!=0){
            int lastDigit = n % 10;
            reverseNum = (reverseNum * 10) + lastDigit;
            n = n/10;
        }

        return originalNum == reverseNum;
    }

    public static void main(String[] args){
        int num1 = 123;
        System.out.println("is the number " + num1 + "palindrome? " + isPalindrome(num1));
        
        int num2 = 121;
        System.out.println("is the number " + num2 + "palindrome? " + isPalindrome(num2));
    }
    
}
