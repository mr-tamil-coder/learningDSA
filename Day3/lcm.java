// 09.To find Lcm 
import java.util.*;

class lcm{
    public static int findGcd(int a,int b){
        while(a!=0 && b!=0){
            if(a>b){
                a=a%b;
            }else{
                b=b%a;
            }
        }
        if(a==0)
            return b;
        else
            return a;
    }
    public static int findLcm(int a,int b){
        return a*b/findGcd(a,b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the a and b to find LCM");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result=findLcm(a,b);
        System.out.println("The LCM of "+a+" and "+b+" is "+result);
    }
}

//TIME COMPLEXITTY - O(log(min(a,b))



//brute force appproach 
/*
 int res=Math.max(a,b)
 while(true){
   if(res%a==0 && res%b==0){
     break;
    }
    res++;
  }
  return res;
  

 */