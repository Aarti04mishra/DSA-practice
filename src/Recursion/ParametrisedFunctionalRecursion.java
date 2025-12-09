package Recursion;

// sum of first n numbers
public class ParametrisedFunctionalRecursion {
    public static void main(String[] args) {
        int n=5;
        System.out.println(sum(n,0));
        System.out.println(sum2(n));
    }

    static int sum(int n,int sum){
        if(n<1){
            return sum;
        }

        return sum(n-1,sum+n);
    }

    static int sum2(int n){
        if(n<1){
            return 0;
        }

        return n+sum2(n-1);
    }
}
