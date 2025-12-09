package Basic_Maths;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int N=371;

        System.out.println(armstrongNum(N));
    }

    static boolean armstrongNum(int N){
        int n=0;
        int dup=N;
        while(N>0){
            int dig=N%10;
            n=n+(dig*dig*dig);

            N/=10;
        }



        return dup==n;
    }
}
