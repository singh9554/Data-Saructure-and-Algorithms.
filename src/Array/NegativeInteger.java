package Array;
import java.util.*;
public class NegativeInteger {
    public static void main(String[] args) {
//        Deque<Integer> lt = new ArrayDeque<Integer>();
//        List<Integer> l = new ArrayList<>();
    int[] arr = {-8,2,3,-6,10};
        int n = arr.length;
        int k = 2;
        //----------------------------------1st approach;
//        for(int i = 0 ;i < n - k + 1;i++) {
//            for (int j = 0; j < k; j++) {
//                int sum = arr[i+j];
//                if (sum < 0) {
//                    lt.offer(arr[i + j]);
//                }
//                }
//            if (lt.size() == 0) {
//                l.add(0);
//            }
//            else {
//                l.add(lt.peek());
//                lt.clear();
//
//            }
//            }
//        System.out.println(l);
//        ------------------------------------------------------------------------------------------------------------
        //Next Approach;
        boolean flag;
        int[] ans = new int[n-k+1];
        int l = 0;
        for(int i = 0; i < (n - k + 1); i++){
            flag = false;

            for(int j = 0; j < k ; j++){
                if(arr[i+j] < 0){
                    ans[l++] = arr[i+j];
                    flag = true;
                    break;
                }
            }

            if(!flag){
                ans[l++] = 0;
            }
        }
        for(int e : ans){
            System.out.print(e+" ");
        }

        }

    }

