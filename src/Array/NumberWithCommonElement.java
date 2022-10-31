package Array;
public class NumberWithCommonElement {
    public static void main(String[]args){
        int []a={1,2,3,4,5,6};
        int []b={3,4,5,6,7};
//        int []a={11,12,13,14,15,16,17,18,19};
//        int []b={14,15,16,17,18,19};
        findCommonElement(a,b);
    }
    //Time complexity is O(N);
    static void findCommonElement(int []a,int []b){
        int n = a.length;
        int i = 0;
        int j = 0;
        while(i < n){
            if(a[i] - b[j] == 0){
                System.out.print(a[i]+" ");
                j++;
                i++;
            }
            else{
                i++;
            }
        }
    }
}
