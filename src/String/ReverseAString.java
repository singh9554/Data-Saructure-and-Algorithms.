package String;
public class ReverseAString{
    public static void main(String[] args) {
        String str = "Welcome to Gfg";
        System.out.println("Before reversing a String: ");
        System.out.println(str);
        char []s = str.toCharArray();
        System.out.println("After reversing a String: ");
        ReverseFullString(s);
        System.out.println(s);
    }
    //steps:
    //First reverse a single word then reverse the whole String;
    //Method to reverse a String;
    static void reverse(char[]s,int start,int end){
        while(start<=end){
            char temp = s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
    }
    static void ReverseFullString(char[]s){
        int n = s.length;
        int start = 0;
        for(int end = 0; end < n ;end++){
            if(s[end] == ' '){
                reverse(s,start,end-1);
                start = end + 1;
            }
        }
        reverse(s,start,n-1);
        reverse(s,0,n-1);
    }
}
