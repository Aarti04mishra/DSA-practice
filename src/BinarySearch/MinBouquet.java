package BinarySearch;

public class MinBouquet {
    public static void main(String[] args) {
        int[] arr={1,10,3,10,2};
        int m=3;
        int k=2;

        System.out.println(minBouquet(arr,m,k));
    }

    static int minBouquet(int[] bloomDay,int m,int k){
        if(m*k>bloomDay.length){
            return -1;
        }
        int low=min(bloomDay);
        int high=max(bloomDay);
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int req=count(bloomDay,m,k,mid);
            if(req==-1){
                low=mid+1;
            }else{
                ans=mid;
                high=mid-1;
            }
        }

        return ans;
    }

    static int count(int[] bloomDay,int m,int k,int mid){
        int bouquet=0;
        int count=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                count++;

            }else{
                bouquet+=count/k;
                count=0;
            }
        }
        bouquet+=count/k;

        if(bouquet>=m){
            return bouquet;
        }else{
            return -1;
        }
    }

    static int min(int[] bloomDay){
        int min=bloomDay[0];

        for(int i=1;i<bloomDay.length;i++){
            min=Math.min(min,bloomDay[i]);
        }

        return min;
    }

    static int max(int[] bloomDay){
        int max=bloomDay[0];

        for(int i=1;i<bloomDay.length;i++){
            max=Math.max(max,bloomDay[i]);
        }

        return max;
    }
}
