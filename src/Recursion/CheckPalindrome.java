package Recursion;
public class CheckPalindrome {
    public static void main(String[] args) {
        String str= "abbcbba";
        int n = str.length();
        System.out.println(checkPalindrome(str,0,n-1));
    }


    static boolean checkPalindrome(String str ,int start,int end){
        if(start>=end){
            return true;
        }
        if(str.charAt(start) == str.charAt(end) && checkPalindrome(str,start+1,end-1)){
            return true;
        }
        return false;
    }
}
