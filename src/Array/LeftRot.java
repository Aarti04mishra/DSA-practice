package Array;

import java.util.Arrays;

public class LeftRot {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
//        leftRot(arr);
        leftRot1(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void leftRot(int[] arr){
        int temp=arr[0];

        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }

        arr[arr.length-1]=temp;
    }

    static void leftRot1(int[] arr){
        reverse(arr,0,arr.length-1);
        reverse(arr,0, arr.length-2);
    }

    static void reverse(int[] arr,int first, int sec){
        while(first<=sec){
            int temp=arr[first];
            arr[first]=arr[sec];
            arr[sec]=temp;

            first++;
            sec--;
        }
    }
}
