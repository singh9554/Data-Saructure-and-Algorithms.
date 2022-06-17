// Leet Code problem;
package Backtracking;
import java.util.*;
public class LexicoGraphicalOrder {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println( lexico(n,0));
    System.out.println( lexico(2,0));

}
static List<Integer> result=new ArrayList<Integer>();
static List<Integer> lexico(int n , int i ){
    lexicoOrder(n,i);
    return result;
}
static void lexicoOrder(int n , int i){
    if(i == n){
        result.add(i);
        return ;
    }
    if(i > n) return ;
    if(i>0) {
        result.add(i);
    }
    for(int j = (i == 0)? 1 : 0;j <=9 ;j++){
        lexico(n,10*i+j);
    }
}
}
