package BasicMaths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintDivisors {
    public static List<Integer> getDivisors(int n){
        List<Integer> divisors = new ArrayList<>();

        for(int i = 1; i*i <=n; i++){
            if(n % i == 0){
                divisors.add(i);

                if(n/i != i){
                    divisors.add(n/i);
                }
            }
        }

        Collections.sort(divisors);
        return divisors;
    }

    public static void main(String[] main){
        int number = 36;

        List<Integer> result = getDivisors(number);

        System.out.println("the divisors of the number " + number + " are " + result);
    }

    
}
