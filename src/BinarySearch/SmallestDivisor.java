package BinarySearch;

public class SmallestDivisor {
    public static void main(String[] args) {
        int[] arr={44,22,33,11,1};
        int threshold=5;
        System.out.println(smallestDivisor(arr,threshold));
    }

    static int smallestDivisor(int[] arr,int threshold){
        int low=min(arr);
        int high=max(arr);
        int div=-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            long ans=find(arr,mid);
            if(ans<=threshold){
                div=mid;
                high=mid-1;

            }else{
                low=mid+1;
            }
        }
        return div;
    }

    static long find(int[] arr, int div){
        long sum=0;

        for(int i=0;i<arr.length;i++){
            sum+=Math.ceil((double)arr[i]/(double) div);
        }

        return sum;
    }

    static int min(int[] arr){
        int min=arr[0];

        for(int i=1;i<arr.length;i++){
            min=Math.min(min,arr[i]);
        }

        return min;
    }

    static int max(int[]arr){
        int max=arr[0];

        for(int i=1;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }

        return max;
    }
}
