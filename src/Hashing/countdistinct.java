package Hashing;
import java.util.*;
public class countdistinct {
    static int count(int []arr){
        HashSet<Integer> s=new HashSet<>();
        for(int element:arr){
            s.add(element);
        }
        return s.size();
    }
    public static void main(String[]args){
        int[] arr={5,10,4,5,5,10};
        System.out.println( count(arr));
    }
}
