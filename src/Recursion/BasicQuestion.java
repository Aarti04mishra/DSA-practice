package Recursion;

//Print Linearly 1 to N
//Print from N to 1

public class BasicQuestion {
    public static void main(String[] args) {
        int N=5;
        System.out.println("Printing Linearly:");
        print(N);
        System.out.println("Reverse Printing:");
        printrev(N);
    }

    static void print(int N){
        if(N==1){
            System.out.println(N);
            return;
        }
        print(N-1);
        System.out.println(N);
    }

    static void printrev(int N){
        if(N==1){
            System.out.println(N);
            return;
        }

        System.out.println(N);
        printrev(N-1);
    }



}
