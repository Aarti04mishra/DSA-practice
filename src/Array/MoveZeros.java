package Array;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
//        int[] arr={1,0,2,3,2,0,0,4,5,1};
        int[] arr={0,0,0,0,9};
        moveZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void moveZeros(int[] arr){
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }

        if(j!=-1){
            for(int i=j+1;i<arr.length;i++){
                if(arr[i]!=0){
                    swap(arr,i,j);
                    j++;
                }
            }
        }
    }

    static void swap(int[] arr,int first,int sec){
        int temp=arr[first];
        arr[first]=arr[sec];
        arr[sec]=temp;
    }
}
