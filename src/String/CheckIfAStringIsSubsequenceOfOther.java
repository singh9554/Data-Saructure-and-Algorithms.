package String;
public class CheckIfAStringIsSubsequenceOfOther {
    public static void main(String[] args) {
        String str1="GEEKSFORGEEKS";
        String str2 ="GRGES";
        int n = str1.length();
        int m = str2.length();
        System.out.println("Iterative solution: "+checkSubsequence(str1,str2));
        System.out.println("Recursive solution: "+checkSubsequenceRecursively(str1,str2,n,m));

    }
    //Iterative solution O(N+M); Aux Space = O(1); Note: It's a Better Solution;
    static boolean checkSubsequence(String str1,String str2){
        int i = 0;
        int j = 0;
        while( i < str1.length() && j < str2.length()){
            if(str1.charAt(i) == str2.charAt(j)){
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        return (j == str2.length());
    }
    //Recursive Solution Time Complexity : O(N+M) and Aux Space O(N+M);
    static boolean checkSubsequenceRecursively(String str1,String str2,int n , int m){
        if(m == 0) return true;
        if(n == 0) return false;
        if(str1.charAt(n-1)==str2.charAt(m-1)){
            return checkSubsequenceRecursively(str1,str2,n-1,m-1);
        }
        else{
            return checkSubsequenceRecursively(str1,str2,n-1,m);
        }
    }
}
