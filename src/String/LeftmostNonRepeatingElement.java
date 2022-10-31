package String;
import java.util.*;
public class LeftmostNonRepeatingElement {
    public static void main(String[] args) {
//        String str = "geeksforgeeks";
        String str = "abcabc";
        System.out.println(findLeftMostNonRepeatingElement1(str));
        System.out.println(findLeftMostNonRepeatingElement2(str));
        System.out.println(findLeftMostNonRepeatingElement3(str));
    }
//Naive Approach Time Complexity is O(N^2) and space Complexity is O(1);
    static int findLeftMostNonRepeatingElement1(String str){
        for(int i = 0 ; i < str.length() ; i++){
            boolean found = true;
            for(int j = 0; j < str.length() ; j++){
                if(i != j && str.charAt(i) == str.charAt(j)){
                    found = false;
                    break;
                }
            }
            if(found){
                return i;
            }
        }
        return -1;
    }
    //Better Approach Time Complexity is O(N) and Space Complexity O(Char) = O(1);
    static int findLeftMostNonRepeatingElement2(String str){
        final int Char = 256;
        int []count = new int [Char];
        for(int i = 0 ; i < str.length() ; i++){
            count[str.charAt(i)]++;
        }
        for(int i =0 ;i < str.length() ; i++){
            if(count[str.charAt(i)]==1){
                return i;
            }
        }
        return -1;
    }
    //Efficient Approach Time complexity O(N + Char) space complexity O(char)
    static int findLeftMostNonRepeatingElement3(String str){
        final int Char = 256;
       int [] fi = new int [Char];
       Arrays.fill(fi,-1);
       int res = Integer.MAX_VALUE;
       for(int i = 0 ; i < str.length() ; i++){
           if(fi[str.charAt(i)] == -1){
               fi[str.charAt(i)] = i;
           }
           else{
               fi[str.charAt(i)] = -2;
           }
       }
       for(int i = 0; i < Char ;i++){
           if(fi[i] >= 0){
               res = Math.min(res,fi[i]);
           }
       }
       return (res == Integer.MAX_VALUE)?-1:res;
    }
}
