package Math;
import java.util.*;
public class UnionSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
      int [] a= new int[n];
      int [] b=new int [m];
      for(int i = 0;i <n;i++){
          a[i]=sc.nextInt();
      }
      for(int i = 0;i<m;i++){
          b[i]=sc.nextInt();
      }
      for(Integer e: a){
        set.add(e);
      }
      for(Integer e: b){
     set.add(e);
      }

        System.out.println(set.size());
    }
}