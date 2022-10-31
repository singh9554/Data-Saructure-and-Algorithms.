package String;

public class AnagramSearchEfficientApproach{
    static final int Char = 256;
    public static void main(String []args){
        String txt = "geeksforgeeks";
        String pat = "frog";
        if (isPresent(txt, pat))
            System.out.println("Anagram search found");
        else
            System.out.println("Anagram search not found");
    }
    static boolean isSame(int []CT, int []CP){
        for(int i = 0; i < Char ;i++){
            if(CT[i] != CP[i]){
                return false;
            }
        }
        return true;
    }
    static boolean isPresent(String TXT, String Pat){
        int []CT = new int [Char]; int[]CP=new int[Char];
        for(int i = 0 ; i < Pat.length();i++){
            CT[TXT.charAt(i)]++;
            CP[Pat.charAt(i)]++;
        }
        for(int i = Pat.length();i < TXT.length();i++){
            if (isSame(CT, CP)) {
                return true;
            }
            CT[TXT.charAt(i)]++;
            CT[TXT.charAt(i-Pat.length())]--;
        }
        return false;
    }
}
