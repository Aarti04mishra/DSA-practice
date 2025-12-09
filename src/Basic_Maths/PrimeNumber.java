package Basic_Maths;

public class PrimeNumber {
    public static void main(String[] args) {
        int n=4;
        System.out.println(prime(n));
    }

    static boolean prime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }
}
