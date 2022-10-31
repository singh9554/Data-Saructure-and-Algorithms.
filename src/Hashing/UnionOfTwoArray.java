package Hashing;
import java.util.*;
public class UnionOfTwoArray {
    public static void main(String[] args) {
//  int []a = {5,10,15,5};
//  int []b = {10,15,4};
        int []a={15,20,5,15};
        int []b={15,15,15,20,10};
//        System.out.println(findUnion(a,b));

    }
    //optimize solution ;time complexity o(m+n) space complexity O(m+n);
    static int findUnion(int[]a,int []b){
        HashSet<Integer>set = new HashSet<>();
        for(int i : a){
            set.add(i);
        }
        for(int i : b){
            set.add(i);
        }
        return set.size();
    }
}
