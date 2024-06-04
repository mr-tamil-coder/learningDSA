public class bitwiseOperators {
    public static void main(String[] args) {
        /*
         - Bitwise OR = |
         - Bitwise AND = &
         - Bitwise XOR = ^
         - Biwise complement = ~
         - left shift = <<
         - signed Right shift = >>  -------MSB IS BASED ON PREVIOUS---------
         - unsigned right shift = >>> -------MSB =0-------
         */
        int a=5,b=9;
        System.out.println("And "+(a&b));
        System.out.println("OR "+(a|b));
        System.out.println("XOR "+(a^b)); 
        a=5;
        b=2;
        System.out.println("Left shift "+(a<<b));
        System.out.println("Complement "+(~a));
        a=5;
        b=1;
        System.out.println("Signed Right shift "+(a>>b));
        System.out.println("Unsigned Right shift "+(a>>b));

    }
}
