// 10. to find given number is prime or not
import java.util.Scanner;

class prime{
    public static boolean findPrime(int n){
        if(n==1)
            return false;
        if(n==2 || n==3)
            return true;
        if(n%2==0 && n%3==0)
            return false;
        for(int i=5;i<=Math.sqrt(n);i+=6){
            if((n%i==0)||(n%(i+2)==0)){
                return false;
            }
        }
        return true;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        boolean result=findPrime(n);
        System.out.println(result?n+" is prime":n+" not prime");
    }
}

//TIME COMPLEXITY - o(root n)