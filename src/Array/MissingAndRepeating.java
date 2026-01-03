package Array;

public class MissingAndRepeating {
    public static void main(String[] args) {
        int[] arr={4,3,6,2,1,1};
        int n=6;

        System.out.println(missingAndRepeating(arr,n));
    }

    static int missingAndRepeating(int[] arr,int n){
        //x-y= S - SN
        //S2-S2N
        int S=(n*(n+1))/2;
        int S2=(n*(n+1)*(2*n+1))/6;
        int SN=0;
        int S2N=0;

        for(int i=0;i<arr.length;i++){
            SN+=arr[i];
            S2N+=(arr[i]*arr[i]);
        }

        int val1= S- SN;
        int val2= S2-S2N;
        val2=val2/val1;
        int x=(val1+val2)/2;
        int y=x-val1;

        return y;
    }
}
