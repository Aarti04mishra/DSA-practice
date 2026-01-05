package BinarySearch;

import java.util.Arrays;

public class FirstandLastOccurence {
    public static void main(String[] args) {
        int[] arr={2,4,8,8,8,8,11,13};
        int x=8;
        System.out.println(Arrays.toString(Occurence(arr,x)));
    }

    static int[] Occurence(int[] arr,int x){
        int[] num={-1,-1};
        num[0]=lowerBound(arr,x);
        num[1]=upperBound(arr,x);

        return num;
    }

    static int upperBound(int[] arr,int x){
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>x){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        if((ans==arr.length) || (arr[ans-1]!=x)){
            return -1;
        }
        return ans-1;
    }

    static int lowerBound(int[] arr,int x){
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=x){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        if((ans==arr.length) || (arr[ans]!=x)){
            return -1;
        }

        return ans;
    }

}
