import java.util.*;
//Count the number of Digits

class countDigits{
    //time complexity - O(n)
    // and space complexity - O(1) 
    public static int CountDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }


    public static void main(String[] args) {
        int num=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits you want to count");
        num = sc.nextInt();
        // int result=CountDigits(num);
        // optimized way in O(1)
        int result=(int)Math.log10(num)+1;
        System.out.println("The total digits is "+result);

    }
}