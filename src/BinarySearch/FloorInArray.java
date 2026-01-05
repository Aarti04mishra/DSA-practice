package BinarySearch;

//floor - largest number in an array<=x
public class FloorInArray {
    public static void main(String[] args) {
      int[] arr={10,20,30,40,50};
      int x=25;
      System.out.println(floor(arr,x));
    }

    static int floor(int[] arr,int x){
        int low=0;
        int high=arr.length-1;
        int ans=-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]<=x){
                ans=arr[mid];
                low=mid+1;
            }else{
                high=mid-1;
            }
        }

        return ans;
    }
}
