package Array;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={2,6,5,8,11};
        int target=16;

        System.out.println(Arrays.toString(twoSum(arr,target)));
    }

    static int[] twoSum(int[] arr,int target){
        int[] num={-1,-1};
        for(int i=0;i<arr.length;i++){
            int rem=target-arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==rem){
                    num[0]=i;
                    num[1]=j;
                    break;
                }
            }
        }

        return num;
    }
}
