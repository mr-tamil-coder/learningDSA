import java.util.*;
// 22. consecutive Binary representation
public class consecutiveBinaryRepresentation {
   public static void main(String[] args) {
    int count=0;
    int n=101;
    while(n>0){
        n=n&(n<<1);
        count++;
    }
    System.out.println("Total consecutive 1s is "+count);
   }
}
