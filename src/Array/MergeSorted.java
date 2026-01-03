package Array;

import java.util.Arrays;

public class MergeSorted {
    public static void main(String[] args) {
        int[] arr={1,2,3,0,0,0};
        int[] arr2={2,5,6};

        mergeSorted(arr,arr2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(1^5);

    }

    static void mergeSorted(int[] arr,int[] arr2){
        int left=arr.length-1;
        int right=0;

        while(left>=0 && right<arr2.length){
            if(arr[left]>arr2[right]){
                int temp=arr[left];
                arr[left]=arr2[right];
                arr2[right]=temp;
                left--;
                right++;
            }else{
                break;
            }
        }

        Arrays.sort(arr);
        Arrays.sort(arr2);

        }
    }