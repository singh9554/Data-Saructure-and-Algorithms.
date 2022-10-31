package String;
public class AnagramSearch {
    public static void main(String[] args) {
       String txt = "GeeksForgeeks";
       String Pat = "Frog";
        if (PatSearch(Pat,txt)) {
            System.out.println("Anagram search found");
        }
        else {
            System.out.println("Anagram search not found");
        }
    }
    //Time complexity of this Naive Approach is O(N-M+1) and Space complexity is Char which is considered as constant;
    static boolean PatSearch(String Pat,String Txt){
        int n = Txt.length();
        int m = Pat.length();
        for(int i = 0; i < n-m+1;i++){
          if(anagramSearch(Pat,Txt,i)){
              return true;
          }
        }
        return false;
    }
    static boolean anagramSearch(String Pat,String Txt,int i){
         final int Char = 256;
         int []count = new int [Char];
         for(int j = 0;j < Pat.length();j++){
             count[Pat.charAt(j)]++;
             count[Txt.charAt(i+j)]--;
         }
         for(int j = 0 ; j < Char;j++){
             if(count[j] !=0){
                 return false;
             }
         }
         return true;
    }
}
