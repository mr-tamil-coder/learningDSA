//11.Sieve of Erathosthenes

import java.util.Scanner;

class primeSieveOfEratosthenes{
    public static void toPrintPrime(int n){
        boolean[] prime=new boolean[n+1];
        for(int i=2;i<=Math.sqrt(n);i++){
            if(prime[i]==false){
                for(int j=i*i;j<=n;j=j+i){
                    prime[j]=true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(prime[i]==false){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        toPrintPrime(n);

    }
}

//TIME COMPLEXITY - o(root n)