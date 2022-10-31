/* Constructing LPS Array , To understand Kmp Algorithm It is important to understand Constructing LPS Array first;
Is this page we discuss to solution of this problem,
1) It is based on Naive Approach,
2) It is based on KMP ALGORITHM;
 */
package String;
import java.util.*;
public class ConstructingLPSArray {
    public static void main(String[]args){
        String txt = "abacabad";
        int[] lps=new int[txt.length()];
        fillLPS(txt,lps);
        fillLPSKMP(txt,lps);
    }
    //Naive Approach with Time complexity of O(N^3) and space complexity is O(1);
    static int longPropPreStuff(String str,int n){
        for(int len = n-1; len > 0; len--){
            boolean flag = true;
            for(int i = 0 ; i < len ;i++){
                if(str.charAt(i) != str.charAt(n-len+i)){
                    flag = false;
                }
            }
            if(flag){
                return len;
            }
        }
        return 0;
    }
    static void fillLPS(String str, int []lps){
        for(int i = 0 ; i < str.length();i++){
            lps[i] = longPropPreStuff(str,i+1);
        }
        System.out.println(Arrays.toString(lps));
    }
    //2nd Approach using KMP algorithm
    static void fillLPSKMP(String str,int []Lps){
       int n = str.length();
       int len = 0;
        Lps[0]=0;
        int i =1;
        while(i < n){
            if(str.charAt(i)==str.charAt(len)){
                len++;
                Lps[i]=len;
                i++;
            }
            else{
                if(len == 0){
                    Lps[i]=0;
                    i++;
                }
                else{
                    len = Lps[len-1];
                }
            }
        }
        System.out.println(Arrays.toString(Lps));
    }

}
