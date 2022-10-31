package String;

public class CheckIfStringIsPalindrome {
    public static void main(String[] args) {
   String str = "ABCCBA";
//        System.out.println(checkPalindrome(str));
        System.out.println(OpCheckPalindrome(str));
    }
    //Naive Approach Time Complexity is O(N) and space complexity is O(N);
    static boolean checkPalindrome(String str){
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        return (str.equals(rev.toString()));
    }
    //Efficient Approach Time Complexity is O(N) and Space Complexity is O(1);
    static boolean OpCheckPalindrome(String str){
        int start = 0;
        int end = str.length()-1;
        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
