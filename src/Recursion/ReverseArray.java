package Recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr,int first, int last){
        if(first==last){
            return;
        }

        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;

        reverse(arr,first+1,last-1);

    }
}
