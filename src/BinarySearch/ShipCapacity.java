package BinarySearch;

public class ShipCapacity {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1};
        int days=4;

        System.out.println(shipCapacity(arr,days));
    }

    static int shipCapacity(int[] weight,int days){
        int low=max(weight);
        int high=sum(weight);

        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;

            int day=days(weight,mid);

            if(day<=days){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        return ans;
    }

    static int sum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }

    static int max(int[]arr){
        int max=arr[0];

        for(int i=1;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }

        return max;
    }

    static int days(int[] arr,int cap){
        int days=1;
        int load=0;

        for(int i=0;i<arr.length;i++){
            if(load+arr[i]>cap){
                days++;
                load=arr[i];
            }else{
                load+=arr[i];
            }
        }

        return days;
    }
}
