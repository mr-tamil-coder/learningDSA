public class findRightMostBit {
    public static int toFindRightMostBit(int n){
        // 18.to find right most set bit position
        int result=n^(n&n-1);
        int expo=(int)(Math.log10(result)/Math.log10(2));
        return expo+1;
    }
    public static int kernighansAlgo(int n){
        //19.count set(1)  bits in a number
        // time complexity =O(logN)
        int count=0;
        while(n>0){
            n=n&n-1;        
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(toFindRightMostBit(8));
        System.out.println(kernighansAlgo(42));
    }
}
