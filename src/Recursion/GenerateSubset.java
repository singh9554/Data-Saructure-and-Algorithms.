package Recursion;
public class GenerateSubset {
    public static void main(String[] args) {
        String str = "abc";
        int n = str.length();
//        subSet(str,n);
        subSet1(str,"");
    }
    //Generating SubSet of a String using bitwise operator Iterative solution;
//    static void subSet(String str,int n){
//        int power = (int) Math.pow(2,n);
//        for(int i = 0;i<power;i++){
//            for(int j = 0;j<n;j++){
//                if(((i>>j)&1) != 0){
//                    System.out.print(str.charAt(j)+" ");
//                }
//            }
//            System.out.println("");
//        }
//    }
    //Generating Subset Using recursive Solution;
    static void subSet1(String str,String out){
        if(str.length() == 0){
            System.out.println(out);
            return;
        }
       String sub = str.substring(1);
        char ch = str.charAt(0);
        subSet1(sub,out);
        subSet1(sub,out+ch);


    }
}
