package BasicMaths;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public static List<Integer> getFibonacci(int n){
        List<Integer> series = new ArrayList<>();

        if(n <= 0) return series;

        if(n == 1){
            series.add(0);
            return series;
        }

        int a = 0;
        int b = 1;

        series.add(a);
        series.add(b);

        for(int i = 2; i<n; i++){
            int nextTerm = a + b;
            series.add(nextTerm);

            a = b;
            b = nextTerm;
        }
        return series;
    }

    public static void main(String[] args){
        int term = 8;
        System.out.println("number of terms for " + term + " are " + getFibonacci(term));
    }
}
