package BasicMaths;

public class EvenOdd {

    public static boolean isEven(int n){
        return n % 2 == 0;
    }

    public static boolean isEvenBitwise(int n){
        return(n & 1) == 0;
    }

    public static void main(String[] args){
        int posEven  = 24;
        int negOdd = -17;

        System.out.println(posEven + "is Even? " + isEven(posEven));
        System.out.println(negOdd + "is Even? " + isEven(negOdd));
        System.out.println(posEven + "is Even? " + isEvenBitwise(posEven));
        System.out.println(posEven + "is Even? " + isEvenBitwise(negOdd));
    }
    
}
