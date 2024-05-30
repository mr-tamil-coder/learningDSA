// 12. print all divisors of given number
import java.util.*;
public class printDivisor {
    public static void BruteForcePrintDivisor(int n){
        // TIME - O(N)
        for (int i = 1; i <=n; i++) {
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
    public static void optimizedPrintDivisor(int n){
        int i=0;
        for ( i = 1; i <= Math.sqrt(n); i++) {
            if(n%i==0)
                System.out.println(i);
        }
        i--;
        for (; i >=1; i--) {
            if(n%i==0 && i!=n/i)
                System.out.println(n/i);

        }
    }
    public static void main(String[] args) {
//         BruteForcePrintDivisor(20);
        optimizedPrintDivisor(20);

    }
}
