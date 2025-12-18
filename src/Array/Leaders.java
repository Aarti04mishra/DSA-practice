package Array;

import java.util.ArrayList;

public class Leaders {
    public static void main(String[] args) {
        int[] arr={10,22,12,3,0,6};

        System.out.println(leaders(arr));

    }

    static ArrayList<Integer> leaders(int[] arr){
        ArrayList<Integer> num=new ArrayList<>();
        num.add(arr[arr.length-1]);
        int max=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>max){
                num.add(arr[i]);
                max=arr[i];
            }
        }

        return num;
    }
}
