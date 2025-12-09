package Basic_Maths;


public class ExtractNumbers {
    public static void main(String[] args) {
        int N=7789;
        extractNum(N);
    }

    static void extractNum(int N){
        while(N!=0){
            System.out.println(N%10);
            N=N/10;
        }
    }
}
