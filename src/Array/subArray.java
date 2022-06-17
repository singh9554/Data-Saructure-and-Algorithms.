package Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class subArray {
    public static void printAllArray(List<Integer>input){
        for(int i=0;i<input.size();i++){
            for(int j=i;j<input.size();j++){
                System.out.println(input.subList(i,j+1));
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> input =  Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        printAllArray(input);
    }
}
