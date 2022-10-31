package String;

public class CheckIfStringsAreRotations {
    public static void main(String[]args){
String str1 = "ABCD";
String str2 = "CDAB";
        System.out.println(areRotation(str1,str2));
    }
    static boolean areRotation(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        return ((str1+str1).indexOf(str2)>=0);
    }
}
