import java.util.*;

public class bitManipulation {
    public static void decimalToBinary(int n){

        /* 

                         2 | 40
                        -----
                        2 | 20 | 0 (remainder)
                        -----
                        2 | 10 | 0 (remainder)
                        -----
                        2 |  5 | 0 (remainder)
                        -----
                        2 |  2 | 1 (remainder)
                        -----
                        2 |  1 | 0 (remainder)
                        -----
                            0 | 1 (remainder)


         */
         String b="";
         while(n>=1){
            int  x=n%2;
             b=x+b; //important we want add front then only we get correct binary
             n=n/2;
         }
         System.out.println("the Binary value is "+b);


    }
 public static void main(String[] args) {
        decimalToBinary(40);
    
 }    
}
