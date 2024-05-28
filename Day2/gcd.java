import java.util.*;
class gcd{
    public static int gcd(int a,int b){
        while(a!=0 && b!=0){
            if(a>b){
                a=a%b;
            }else{
                b=b%a;
            }
        }
        if(a==0){
            return b;
        }else{
            return a;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of gcd a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result=gcd(a,b);
        System.out.println("The gcd of"+a+" and "+b+" is "+result);
    }
}
//Time complexity : O(log(min(a,b)))