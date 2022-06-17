package Searching;
public class CountOccurrencesInSorted {
    public static void main(String[] args) {
//        int []arr={10,15,20,20,20,40,40};
        int []arr={5,8,8,10,10};
        int n = arr.length;
//        int x = 20;
        int x = 10;
        System.out.println(countOccurrences(arr,n,x));
    }
    //Find firstOccurrences.
    static int firstOccurrences(int []arr,int n,int x){
        int low = 0;
        int high = n - 1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == x){
                if(mid == 0 || arr[mid - 1] != arr[mid]){
                    return mid;
                }
                else{
                    high = mid - 1;
                }
            }
            else if (arr[mid] < x){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
    //find LastOccurrences.
    static int LastOccurrences(int[]arr,int n,int x){
        int low = 0;
        int high = n - 1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == x){
                if(mid == n-1 || arr[mid] != arr[mid+1]){
                    return mid;
                }
                else{
                    low = mid + 1;
                }
            }
            else if(arr[mid] < x){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
    // Method to count the occurrences, call two binary Search,
    //Time complexity O(log n)space complexity O(1)
static int countOccurrences(int []arr,int n,int x){
        int first = firstOccurrences(arr,n,x);
        if(first == -1){
            return 0;
        }
        return (LastOccurrences(arr,n,x) - first + 1);
}
}
