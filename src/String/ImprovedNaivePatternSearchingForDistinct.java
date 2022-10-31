package String;

public class ImprovedNaivePatternSearchingForDistinct {
    public static void main(String[]args){
        String str1 = "ABCEABEFABCD";
        String str2 = "ABCD";
        PatternSearch(str1,str2);
    }
    //Time complexity of This Approach is O(N) and space Complexity is O(1);
    static void PatternSearch(String str1,String str2){
        int n = str1.length();
        int m = str2.length();
        for(int i = 0 ;i <=n - m;){
            int j;
            for(j = 0; j < m ; j++){
                if(str1.charAt(i+j) != str2.charAt(j)){
                    break;
                }
            }
            if(j == m){
                System.out.print(i+" ");
            }
            if(j == 0){
                i++;
            }
            else{
                 i = i + j;
            }
        }
    }
}
