package BinarySearch;

public class KoKoEatingBanana {
    public static void main(String[] args) {
        int[] piles={805306368,805306368,805306368};
        int h=1000000000;

        System.out.println(kokoEatingBanana(piles,h));
    }

    static int kokoEatingBanana(int[] piles,int h){
        int low=1;
        int high=max(piles);
        int ans=high;
        int sum=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            long reqTime=totalHours(piles,mid);
            if(reqTime<=h){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        return ans;
    }

    static long totalHours(int[] piles, int hourly) {
        long totalHours = 0;

        for (int num : piles) {
            totalHours += (num + hourly - 1L) / hourly;
        }

        return totalHours;
    }


    static int max(int[] piles){
        int max=piles[0];

        for(int i=1;i<piles.length;i++){

            max=Math.max(max,piles[i]);
        }

        return max;
    }
}
