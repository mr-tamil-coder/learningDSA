public class findRightMostBit {
    public static int toFindRightMostBit(int n){
        // 18.to find right most set bit position
        int result=n^(n&n-1);
        int expo=(int)(Math.log10(result)/Math.log10(2));
        return expo+1;
    }
      public static void main(String[] args) {
        System.out.println(toFindRightMostBit(8));
    }
}
