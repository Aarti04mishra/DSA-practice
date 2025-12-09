package Basic_Maths;

public class CheckPalindrome {
    public static void main(String[] args) {
        int N=121;
        System.out.println(checkPalindrome(N));
    }

    static boolean checkPalindrome(int N){
        int prev=N;
        int rev=0;
        while(N>0){
            int dig=N%10;
            rev=rev*10+dig;
            N/=10;
        }

        return rev==prev;
    }
}
