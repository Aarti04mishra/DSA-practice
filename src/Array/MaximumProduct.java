package Array;

public class MaximumProduct {
    public static void main(String[] args) {
        int[] arr={2,3,-2,4};
        System.out.println(maximumProduct(arr));
    }

    static int maximumProduct(int[] arr){
        int pre=1;
        int suff=1;
        int ans=Integer.MIN_VALUE;
        int n=arr.length;

        for(int i=0;i<n;i++){
            if(pre==0) pre=1;
            if(suff==0) suff=1;

            pre=pre*arr[i];
            suff=suff*arr[n-i-1];
            ans=Math.max(ans,Math.max(pre,suff));
        }

        return ans;
    }
}
