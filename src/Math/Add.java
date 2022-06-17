package Math;
public class Add {
    public static void main(String[]args){
        int number=12345;
        int sum=0;
        for(int i=number;i>0;i=i/10){
            int curr=number%10;
            sum +=curr;
            number= number/10;
        }
        System.out.println(sum);
    }
}
