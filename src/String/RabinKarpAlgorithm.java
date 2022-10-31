package String;

public class RabinKarpAlgorithm{
    public static void main(String[]args){
        String txt = "GEEKS FOR GEEKS";String pat="GEEK";
        System.out.println("All index numbers where pattern found: ");
        RBSearch(txt,pat);
    }
    static void RBSearch(String txt,String Pat){
        int n = txt.length();
        int m = Pat.length();
        final int d = 256;
        final int q = 101;
        //compute (d^m-n)%q;
        int h = 1;
        for(int i = 1; i<= m-1; i++){
            h = (h*d)%q;
        }
        //compute p and t;
        int p = 0;
        int t = 0;
        for(int i = 0 ; i < m ;i++){
        p = (p*d+Pat.charAt(i))%q;
        t = (t*d+txt.charAt(i))%q;
        }
        for(int i = 0 ; i < n-m+1;i++){
            if(p == t){
                boolean flag = false;
                for(int j = 0 ; j<m;j++){
                    if(txt.charAt(i+j) != Pat.charAt(j)){
                        flag = true;
                        break;
                    }
                }
                if(!flag){
                    System.out.print(i+" ");
                }
            }
            //Compute ti+1 using ti
            if(i<n-m){
                t=((d*(t-txt.charAt(i)*h))+txt.charAt(i+m))%q;
                if(t<0){
                    t=t+q;
                }
            }
        }
    }
}
