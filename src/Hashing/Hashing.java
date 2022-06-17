package Hashing;
import java.util.*;
public class Hashing {
    static void hashing(){
        HashSet<Integer> s=new HashSet<>();
        s.add(4);
        s.add(5);
        s.add(6);
        s.add(7);
        s.add(8);
        System.out.println(s+" ");
        if(s.contains(7)){
            System.out.println("Present");
        }
        else{
            System.out.println("Not Present");
        }
        s.remove(6);
        System.out.println(s+" ");
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        s.clear();
        System.out.print(s+" ");
    }
    public static void main(String[]args){
        hashing();
    }
}
