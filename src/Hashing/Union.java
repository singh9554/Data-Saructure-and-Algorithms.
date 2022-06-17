package Hashing;
import java.util.*;
public class Union {
    static int union(int a[],int b[]){
        Set<Integer> s=new HashSet<>();
        for(int element:a){
            s.add(element);
        }
        for(int element:b){
            s.add(element);
        }
        return s.size();
    }
    public static void main(String[]args){
        Union obj=new Union();
        int a[]={5,10,15,5};
        int b[]={10,15,4};
        System.out.println("The size of a union set is: ");
         System.out.println(union(a,b));
    }
}
