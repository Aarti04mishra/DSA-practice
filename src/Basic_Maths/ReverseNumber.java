package Basic_Maths;

public class ReverseNumber {
    public static void main(String[] args) {
        int N=7789;
        System.out.println(reverseNum(N));
    }

    static int reverseNum(int N){
        int rev=0;
        while(N>0){
            int dig=N%10;
            rev=rev*10+dig;
            N/=10;
        }

        return rev;
    }
}
