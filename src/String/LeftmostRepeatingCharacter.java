package String;
import java.util.*;
public class LeftmostRepeatingCharacter {
     public static void main(String[]args){
         String str ="abbcc";
//         String str = "geeksforgeeks";
//         String str = "abcd";
         System.out.println(checkLeftmostRepeating1(str));
         System.out.println(checkLeftmostRepeating2(str));
         System.out.println(checkLeftmostRepeating3(str));
         System.out.println(checkLeftmostRepeating4(str));
     }
     //Naive Approach Time complexity is O(N^2) and space complexity is O(1);
     static int checkLeftmostRepeating1(String str){
         int n = str.length();
         for(int i = 0; i < n ;i++){
             for(int j = i+1; j < n;j++){
                 if(str.charAt(i) == str.charAt(j)){
                     return i;
                 }
             }
         }
         return -1;
     }
     //Better Approach Time Complexity is O(N) and Space complexity is char;
    static int checkLeftmostRepeating2(String str){
         final int Char = 256;
         int []count = new int[Char];
         for(int i =0; i < str.length();i++){
             count[str.charAt(i)]++;
         }
         for(int i = 0; i < str.length();i++){
             if(count[str.charAt(i)] > 1){
                 return i;
             }
         }
         return -1;
    }
    //Efficient Approach Time complexity in O(N) and space complexity O(Char);
    static int checkLeftmostRepeating3(String str){
         final int Char = 256;
         int []findex = new int [Char];
         Arrays.fill(findex,-1);
         int res = Integer.MAX_VALUE;
         for(int i = 0; i < str.length();i++){
             int fi = findex[str.charAt(i)];
             if(fi == -1){
                 findex[str.charAt(i)] = i;
             }
             else{
                 res = Math.min(res,fi);
             }
         }
         return (res == Integer.MAX_VALUE)?-1:res;
    }
    //More Efficient Approach Time complexity is O(N) and space complexity is O(char);
    static int checkLeftmostRepeating4(String str){
         final int Char = 256;
         boolean [] visited = new boolean[Char];
         int res = -1;
         for(int i = str.length()-1; i >=0 ;i--){
             if(!visited[str.charAt(i)]){
                 visited[str.charAt(i)] = true;
             }
             else {
                 res = i;
             }
         }
         return res;
    }
}
