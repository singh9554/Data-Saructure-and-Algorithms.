package Bitwise;

public class CountSetBit {
    public static void main(String[] args) {
        int n =5;
        System.out.println(setBit(n));
        System.out.println(brian(n));
    }
    static int setBit(int n){
        int count = 0;
      while(n>0){
//          if(n%2 != 0){
//              count++;
//          }
//          n = n/2;
          if((n & 1) == 1){
              count++;
          }
          n = n >> 1;
      }
      return count;
    }
    //Brian's kerningam's algorithm;
    static int brian(int n){
        int count = 0;
        while(n>0){
            count++;
           n= n&(n-1);
        }
        return count;
    }
}
