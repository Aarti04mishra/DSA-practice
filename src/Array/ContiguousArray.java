package Array;

import java.util.HashMap;

public class ContiguousArray {
    public static void main(String[] args) {
        int[] arr={0,1,1,1,1,1,0,0,0};

        System.out.println(contiguousArray(arr));
    }

    static int contiguousArray(int[] arr){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                arr[i]=-1;
            }
        }
        int sum=0;
        int count=0;


        return count;
    }
}
