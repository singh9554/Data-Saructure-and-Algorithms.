package Searching;
import java.util.*;
public class MaximumNumberOfGroupsEnteringACompetition {
    public static void main(String[]args){
    int []grades={10,6,5,3,7,12};
        System.out.println(MaximumNumbersOfGroups(grades));
    }
    static int MaximumNumbersOfGroups(int []grades){
        int x = 1;
        int n = grades.length ;
        while(x*(x+1)/2<=n){
            x++;
        }
        return --x;
    }
}
