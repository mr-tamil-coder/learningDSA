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
    public static void toggleBit(){
        // Toogle Ith position

        int n=36;
        int i=5;
        int toggleMask=1<<i;
        System.out.println("After toogle the bit value is"+(n^toggleMask));
    }
    public static void checkOnOrOff(){
        // Check On and Off
        int n=36,i=5;
        int cmask=1<<i;
        if((n&cmask)==0)
        System.out.println("the bit is off");
        else
        System.out.println("the bit is on");

    }
    public static void main(String[] args) {
       switchOn(); 
       switchOff();
       toggleBit();
       checkOnOrOff();


    }
}
