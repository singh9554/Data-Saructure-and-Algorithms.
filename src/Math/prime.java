package Math;
public class prime {
public static void main(String []args){
    Prime(6);
}
static void Prime(int number){
    int count=0;
    for(int i=1;i<number;i++){
        if(number%i==0){
            count++;
        }
    }
    if(count==1){
        System.out.println(number+" is a prime number");
    }
    else{
        System.out.println(number+ " is not a prime number");
    }
}
}
