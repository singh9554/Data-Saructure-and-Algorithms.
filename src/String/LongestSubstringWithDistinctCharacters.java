package String;

public class LongestSubstringWithDistinctCharacters {
    public static void main(String []args){
//      String str = "abcdaba";
//        String str = "aaa";
        String str = "abaacdbab";
        System.out.println(lengthOfLongestSubstring(str));
    }
    static boolean findDistinct(String txt,int i , int j){
      boolean []visited = new boolean[256];
      for(int k = i; k <=j ;k++ ){
          if(visited[txt.charAt(k)]==true){
              return false;
          }
          visited[txt.charAt(k)]=true;
      }
      return true;
    }
    static int lengthOfLongestSubstring(String s) {
    int n = s.length();
    int res = 0;
    for(int i = 0 ; i < n;i++){
        for(int j = 0 ; j < n;j++){
            if(findDistinct(s,i,j)){
                res = Math.max(res,j-i+1);
            }
        }
    }
    return res;
    }
}
