package Searching;

public class TwoPointerApproach {
    public static void main(String[] args) {
        int []arr={3,5,9,2,8,10,11};
//        int []arr={8,4,6};
        int n = arr.length;
        int x = 17;
//        int x = 11;
//        System.out.println(naiveApproach(arr,n,x));
        System.out.println(twoPointer(arr,n,x));
    }
//    static boolean naiveApproach(int[]arr,int n,int x){
//        int sum = 0;
//        for(int i = 0;i<n;i++){
//           sum = arr[i];
//            for(int j = i + 1; j < n ; j++){
//                if(sum + arr[j]==x){
//                    System.out.println(sum+" "+arr[j]);
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
    //Two Pointers Approach;
    static boolean twoPointer(int []arr,int n,int x){
        int start = 0;
        int end = n-1;
        while(start < end){
            if(arr[start] + arr[end] == x){
                System.out.println(arr[start]+" "+arr[end]);
                return true;
            }
            else if((arr[start] + arr[end] )>x){
                end--;
            }
            else{
                start++;
            }
        }
        return false;
    }
}
