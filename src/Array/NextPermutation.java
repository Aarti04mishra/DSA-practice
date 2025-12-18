package Array;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr={2,1,5,4,3,0,0};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void nextPermutation(int[] arr){
       int i=arr.length-2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i >= 0) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] > arr[i]) {
                    swap(arr, i, j);
                    break;
                }
            }
        }

       reverse(arr,i+1,arr.length-1);
    }
    static void reverse(int[] arr,int i,int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    static void swap(int[] arr,int first, int sec){
        int temp=arr[first];
        arr[first]=arr[sec];
        arr[sec]=temp;
    }
}
