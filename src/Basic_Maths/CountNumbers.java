package Basic_Maths;

public class CountNumbers {
    public static void main(String[] args) {
        double N= 778;
        int ans=(int)Math.log10(N)+1;

        System.out.println(ans);
//        System.out.println(countNumbers(N));
    }

    static int countNumbers(int n){
        int count=0;
        while(n>0){
            count++;
            n/=10;
        }

        return count;
    }


}
