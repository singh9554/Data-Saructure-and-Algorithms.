package Bitwise;
public class FindingOddAppearIngNumber {
    public static void main(String[]args){
     int []arr={4,4,3,4,4,5,7,7};
//        int []arr={1,1,2,2,2,2,3,4,4,4,4,5,5,6};
     int n = arr.length;
     odd(arr,n);
    }
    static void odd(int[]arr,int n){
        int xor=0;
        for(int i = 0;i<n;i++){
            xor = xor^arr[i];
        }
       int  b = xor & (~(xor-1));
        int res1=0,res2=0;
        for(int i = 0;i<n;i++){
            if(((arr[i] & b)!=0)){
                res1=res1^arr[i];
            }
            else{
                res2=res2^arr[i];
            }
        }
        System.out.print(res1+" "+res2);
    }
}
