package Backtracking;
public class PermutationString {
    public static void main(String[] args) {
        String s=new String("abc");
permutation(s,0);
    }
static void swap(String str,int j,int i){
        char[] c=str.toCharArray();
        char temp = c[i] ;
        c[i] = c[j];
        c[j] = temp;

    }
    static void permutation(String str,int i){
        if(i == str.length()-1){
            System.out.println(str);
            return;
        } boolean []visited= new boolean[26];
        for(int j = i ;  j<str.length() ; j++){
            char ch = str.charAt(j);
            if(!visited[ch-'a']){
                visited[ch-'a']=true;
                swap(str,str.charAt(j),str.charAt(i));
             permutation(str,i+1);
                swap(str,str.charAt(j),str.charAt(i));
            }
        }
    }
}
