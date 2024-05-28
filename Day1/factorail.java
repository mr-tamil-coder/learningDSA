import java.util.*;

class factorial{
    public static void main(String[] args) {
        long result =1;
        int n;
        System.out.println("Enter the number you want to do factorial");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=n;i>1;i--)
            result*=i;
        System.out.println("The factorial is "+result);

    }
}