package String;
import java.util.*;
public class SortAnArrayAccordingToTheOther {
    public static void main(String []args){
   int []A1={2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
   int []A2= {2, 1, 8, 3};
   int N = A1.length;
   int M = A2.length;
   NaiveSortByA2(A1,N,A2,M);
        sortA1ByA2(A1,N,A2,M);
    }
    //Naive Approach time complexity O(N^2) space complexity O(N);
    static void NaiveSortByA2(int []A1,int N, int []A2,int M){
        int []temp = new int[N];
        int idx = 0;
        for(int i = 0 ; i < M ;i++){
            for(int j = i; j < N ;j++){
                if(A1[j] == A2[i]){
                    temp[idx++] = A1[j];
                }
            }
        }
        System.out.println(Arrays.toString(temp));
    }
    //Efficient approach time complexity O(N Log N) and space Complexity O(N);
    static void sortA1ByA2(int []A1, int N, int []A2, int M) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i : A1) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        int[] temp = new int[N];
        int idx = 0;
        for (int i = 0; i < M; i++) {
            if (hm.containsKey(A2[i])) {
                int freq = hm.get(A2[i]);
                while (freq > 0) {
                    temp[idx++] = A2[i];
                    freq--;
                }
                hm.remove(A2[i]);
            }
        }
        Arrays.sort(A1);
        for(int i = 0 ; i < N ;i++){
            if(hm.containsKey(A1[i])){
                temp[idx++]=A1[i];
            }
        }
        A1=temp;
        System.out.println(Arrays.toString(A1));
    }
}
