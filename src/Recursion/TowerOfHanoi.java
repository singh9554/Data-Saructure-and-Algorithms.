package Recursion;
public class TowerOfHanoi {
    public static void main(String[] args) {
towerOfHanoi(3,'a','b','c');
    }
    static void towerOfHanoi(int n,char a, char b, char c){
        int move =0;
        if(n == 1){
            System.out.println("Move 1 from "+a+" to "+c);
            return;
        }
//        towerOfHanoi(n-1,a,c,b);
        towerOfHanoi(n-1,a,b,c);
        System.out.println("Move "+n+" from "+a+" to "+c);
        towerOfHanoi(n-1,b,a,c);
    }
}
