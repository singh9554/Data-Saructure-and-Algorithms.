package Hashing;
import java.util.*;
public class intersection {
    static int inter(int []a,int []b){
        Set<Integer> s=new HashSet<>();
        int count=0;
        for(int x:a){
            s.add(x);
        }
        for(int x:b){
            if(s.contains(x)){
                count++;
                s.remove(x);
            }
        }
        return count;
    }
    public static void main(String[]args){
        int []a={5,10,15,5,10};
        int []b={15,5,5,10,4};
        System.out.println(inter(a,b));
    }
}
