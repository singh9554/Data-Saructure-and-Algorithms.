package Recursion;
public class RopeCuttingProblem {
    public static void main(String[] args) {
 int n = 5;
        System.out.println(ropeLength(5,2,5,1));
    }
    static int ropeLength(int n ,int a ,int b ,int c){
        if(n == 0){
            return 0;
        }
        if(n < 0){
            return -1;
        }
        int res = Math.max(ropeLength(n-a,a,b,c),Math.max(ropeLength(n-b,a,b,c),ropeLength(n-c,a,b,c)));
        if(res == -1){
            return -1;
        }
        return res + 1;
    }
}
