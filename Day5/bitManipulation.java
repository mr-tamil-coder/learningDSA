import java.util.*;

public class bitManipulation {
    public static String decimalToBinary(int n){

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
         return b;


    }
    public static int binaryToDecimal(String b){
        int result=0;
        int powerOf2=1;
        for(int i=b.length()-1;i>=0;i--){
            if(b.charAt(i)=='1'){
                result=result+powerOf2;
            }
            powerOf2=powerOf2*2;
        }
        return result;
    }
    
     public static void main(String[] args) {
        int decimal=40;
        String binary=decimalToBinary(decimal);
        System.out.println(binaryToDecimal(binary));
     }
    
    
}
