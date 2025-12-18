package Array;

import java.util.Arrays;

public class DutchFlag {
    public static void main(String[] args) {
        int[] arr={0,1,2,0,1,2,1,2,0,0,0,1};
        dutchFlag(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void dutchFlag(int[] arr){
        int start=0;
        int mid=0;
        int end=arr.length-1;

        while(mid<=end){
            if(arr[mid]==0){
                swap(arr,mid,start);
                start++;
                mid++;
            }else if(arr[mid]==2){
                swap(arr,mid,end);
                end--;
            }else{
                mid++;
            }
        }


    }

    static void swap(int[] arr,int first,int sec){
        int temp=arr[first];
        arr[first]=arr[sec];
        arr[sec]=temp;
    }
}
