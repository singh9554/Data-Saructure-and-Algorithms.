package Recursion;

public class StringSubsequence {
    public static void main(String[] args) {
sub("abc","");
    }
    static void sub(String str, String out){
        if(str.length()==0) {
            System.out.println(out);
            return;
        }
        String ros = str.substring(1);
        char ch = str.charAt(0);
        sub(ros,out);
        sub(ros,out+ch);


    }
}
