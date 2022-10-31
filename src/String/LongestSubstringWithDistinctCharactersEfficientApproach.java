package String;
import java.util.*;
public class LongestSubstringWithDistinctCharactersEfficientApproach {
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(countDistinct(str));
    }
    public static int countDistinct(String str){
        int n = str.length();
        int res = 0;
        for(int i = 0 ; i < n ;i++){
            boolean []visited = new boolean[256];
            for(int j = i; j < n ;j++){
                if(visited[str.charAt(j)]){
                    break;
                }
                else{
                    res = Math.max(res,j-i+1);
                    visited[str.charAt(j)] = true;
                }

            }
        }
        return res;
    }
}
