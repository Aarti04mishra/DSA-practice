package Array;

import java.util.Arrays;

public class RemoveDupli {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,4};
        remDup(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void remDup(int[] arr){
        int j=0;
        int i=1;
        while(i<arr.length){
            if(arr[i]!=arr[j]){
                j++;
                swap(arr,i,j);
            }

            i++;
        }

    }

    static void swap(int[] arr,int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
