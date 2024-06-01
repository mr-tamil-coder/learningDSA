// 17.Bit masking


import java.util.*;
public class bitMasking {
    public static void switchOn(){
        // Switch on Ith position
        int n=36;
        int i=3;
        int onMask=1<<i;
        System.out.println("The final value is "+(n|onMask));
    }
    public static void switchOff(){
        // Switch off Ith position
        int n=36;
        int i=5;
        int offMask=~(1<<i);
        System.out.println("The final value after off is "+(n&offMask));
    }
    public static void main(String[] args) {
       switchOn(); 
       switchOff();

    }
}
