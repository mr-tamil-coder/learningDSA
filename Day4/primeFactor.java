// 13.Find all the prime factors of a number
import java.util.*;

public class primeFactor {
    public static void findPrimeFactors(int n){
        // Time complexity - O(root(n)logn)
        int i=2;
        while(i<=Math.sqrt(n)){ //(or) Squaring on both sides  - i*i<=n
            while(n%i==0){
                System.out.println(i);
                n=n/i;
            }
            i++;
        }
        if(n>1)
         System.out.println(n);
    }
    public static void main(String[] args) {
        findPrimeFactors(40);
    }
}
