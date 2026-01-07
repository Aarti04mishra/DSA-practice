package BinarySearch;

public class Sqrt {
    public static void main(String[] args) {
        int x=53;
        System.out.println(sqrt(x));
    }

    static int sqrt(int x){
        int low=1;
        int high=x;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;

            if(mid*mid==x){
                return mid;
            }

            if(mid*mid<x){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }

        return ans;
    }
}
