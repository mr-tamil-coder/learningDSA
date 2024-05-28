// Given a nummber to find the number of trailing zeros of the factorail
import java.util.*;

class trailingZero{
    public static int findTrailingZero(int n){
        int res=0;
        while(n>0){
            res+=n/5;
            n=n/5;
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter to find zeros");
        int res=sc.nextInt();
        System.out.println(findTrailingZero(res));

    }
}