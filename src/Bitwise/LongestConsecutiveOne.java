package Bitwise;
public class LongestConsecutiveOne {
    public static void main(String[] args) {
        int n = 691;
        System.out.println(count(n));
    }
    static int count(int n){
        int count = 0;
        int Max = 0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            else if((n&1) == 0){
                Max = Math.max(Max,count);
                count=0;
            }
            n = n>>1;
        }
        Max = Math.max(Max,count);
        return Max;
    }
}
