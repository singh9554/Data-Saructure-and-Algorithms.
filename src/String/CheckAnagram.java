package String;
import java.util.*;
public class CheckAnagram {
    public static void main(String[]args){
        String s1 = "listen";
        String s2 = "silent";
        System.out.println("Naive Approach: "+checkAnagram(s1,s2));
        System.out.println("Efficient Approach: "+opCheckAnagram(s1,s2));
    }
    //Naive Approach Time complexity is O(N log N) and Space complexity O(N);
    static boolean checkAnagram(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        char [] a = s1.toCharArray();
        Arrays.sort(a);
        s1 = new String(a);
        char [] b = s2.toCharArray();
        Arrays.sort(b);
        s2 = new String(b);

        return s1.equals(s2);
    }
    // Efficient Approach Using Standard Counting Algorithm;
    //Time complexity is O(N) and Space Complexity O(char);
    static boolean opCheckAnagram(String s1, String s2){
        final int Char = 256;
        if(s1.length() != s2.length()){
            return false;
        }
        int []count = new int[Char];
        for(int i = 0; i < s1.length();i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for(int i = 0; i < Char;i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true;
    }
}
