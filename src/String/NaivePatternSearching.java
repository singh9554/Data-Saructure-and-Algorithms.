package String;
public class NaivePatternSearching {
    public static void main(String []args){
        String str1 = "ABABABCD";
        String str2 = "ABAB";
        /*
//        String str1 = "AAAAA";
//        String str2 = "AAA";
//        String str1 = "ABCABCD";
//        String str2 = "ABCD";
         */
        PatternSearch(str1,str2);
    }
    //Time complexity is O(n - m + 1) and space complexity is O(1);
    static void PatternSearch(String str1, String str2){
        int n = str1.length();
        int m = str2.length();
        for(int i = 0; i < n - m + 1; i++){
            boolean flag = false;
            for(int j = 0; j < m ; j++){
                if(str1.charAt(i+j) != str2.charAt(j)){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.print(i+" ");
            }
        }
    }
}
