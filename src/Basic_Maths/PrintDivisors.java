package Basic_Maths;

import java.util.ArrayList;

public class PrintDivisors {
    public static void main(String[] args) {
        int N=36;
        System.out.println(divisors(N));
    }

    static ArrayList<Integer> divisors(int N){
        ArrayList<Integer> num=new ArrayList<>();

        for(int i=1;i*i<=N;i++){
            if(N%i==0){
                num.add(i);
                if(N/i!=i){
                    num.add(N/i);
                }
            }
        }

        return num;
    }
}
