package Math;
public class GP {
    public static void main(String[] args) {
        double A = 2;
        double B = 3;
        double N = 1;
        System.out.println(Gp(A, B, N));

    }
    static double Gp(double A, double B , double N) {
        double r= B / A;
        double n = N -1;
    if(N == 1){
        return A;
    }
    else{
        for(int i = 1; i <= N; i++){
            A = A * r;
        }
        return A;
    }
    }
}
