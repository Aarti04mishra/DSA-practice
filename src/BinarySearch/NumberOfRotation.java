package BinarySearch;

public class NumberOfRotation {
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        System.out.println(rotationCount(arr));
    }

    static int rotationCount(int[] arr){
        int low=0;
        int high=arr.length-1;
        int index=-1;
        int ans=Integer.MAX_VALUE;

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[low]<=arr[high]){
                if(ans>arr[low]){
                    ans=arr[low];
                    index=low;
                }
                break;
            }

            if(arr[low]<=arr[mid]){
                if(ans>arr[low]){
                    ans=arr[low];
                    index=low;
                }
                low=mid+1;
            }else{
                high=mid-1;
                if(ans>arr[mid]){
                    ans=arr[mid];
                    index=mid;
                }
            }
        }

        return index;
    }
}
