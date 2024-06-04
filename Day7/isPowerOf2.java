//20.Find whether a number is powerOf2
import java.util.*;
public class isPowerOf2 {
    public static boolean checkPowerOf2(int n){
        //time complexity = O(1)
        if((n&n<<1)==0)
          return true;
        return false;
    }
    public static void main(String[] args) {

        System.out.println(checkPowerOf2(8));
        System.out.println(checkPowerOf2(7));

    }
}

