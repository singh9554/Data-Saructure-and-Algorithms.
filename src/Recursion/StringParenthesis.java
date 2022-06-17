/**Given a value print all the String of parenthesis have balanced parenthesis of length ;
 * I/P = 2;
 * O/P = () ()
 *       (())
 */
package Recursion;
public class StringParenthesis{
    public static void main(String[] args) {
        Parenthesis(0,0,3," ");
    }
    static void Parenthesis(int open ,int close,int n , String out){
        if(close == n){
            System.out.println(out);
            return;
        }
        if(open < n){
            Parenthesis(open+1,close,n,out+"(");
        }
        if(close < open){
            Parenthesis(open,close+1,n,out+")");
        }
    }
}
