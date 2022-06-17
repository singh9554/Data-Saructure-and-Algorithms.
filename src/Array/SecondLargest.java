package Array;
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {5, 20, 12, 20, 10};
//        int []arr={10,10,10};
        int n = arr.length;
//        System.out.println(secondLargest(arr,n));
        System.out.println(SecondLargest1(arr,n));
    }
        //Naive approach;
//    static int largest(int []arr,int n){
//        int largest = 0;
//        for(int i = 1; i < n ;i++){
//            if(arr[i]>arr[largest]){
//                largest = i;
//            }
//        }return largest;
//    }
//    static int secondLargest(int []arr,int n){
//        int largest = largest(arr,n);
//        int res = -1;
//        for(int i = 0 ; i < n ; i++){
//            if(arr[i]!=arr[largest]){
//                if(res == -1){
//                    res = i;
//                }
//                else if(arr[i]>arr[res]){
//                    res = i;
//                }
//            }
//        }
//        return res;
//    }
    //Optimize solution;
        static int SecondLargest1( int[] arr, int n){
          int largest = 0;
          int res = -1;
          for(int i = 1 ; i < n ; i++){
              if(arr[i] >arr[largest]){
                 res = largest;
                         largest = i;
              }
              else if (arr[i] != arr[largest]){
                  if(res==-1 || arr[i]>arr[res]){
                      res= i;
                  }
              }
          }
          return res;
        }
    }

