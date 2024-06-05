import java.util.HashSet;

public class lonelyInteger {
    public static int usingXor(int arr[]){
        int result=0;
        for (int i : arr) {
            result=result^i;
        }
        return result;
    }
    public static int usingHashset(int arr[]){
            HashSet<Integer> s=new HashSet<Integer>();
            for (int i : arr) {
                if(s.contains(i)){
                    s.remove(i);
                }else{
                    s.add(i);
                }   
            }
            for(int i:s){
                return i;
            }
            return -1;

    }
    public static void main(String[] args) {
        int arr[]={2,3,4,2,3};
        System.out.println("the lonely integer using Hashset is "+ usingHashset(arr));
        System.out.println("the lonely integer using xor operaton is "+ usingXor(arr));
       
    }
}
