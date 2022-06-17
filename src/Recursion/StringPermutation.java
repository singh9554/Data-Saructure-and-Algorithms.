package Recursion;
public class StringPermutation {
    public static void main(String[] args){

        permutation("aba"," ");
    }
    static void permutation(String str,String out){
        if(str.length()==0){
            System.out.println(out);
            return;
        }
        boolean [] visited =new boolean[26];
        for(int i = 0; i<str.length(); i++){
            char ch =str.charAt(i);
            if (!visited[ch-'a']) {
                visited[ch-'a']=true;
                String Ros = str.substring(0, i) + str.substring(i + 1);
                permutation(Ros, out + ch);
            }
        }
    }
}
