package Arrays;

//Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
//Output: [-1,3,-1]
//Explanation: The next greater element for each value of nums1 is as follows:
//- 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
//- 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
//- 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.

import java.lang.reflect.Array;
import java.util.Arrays;

public class NextGreaterElement1 {
    public static void main(String[] args) {
        int[] nums1={2,4};
        int[] nums2={1,2,3,4};

        System.out.println(Arrays.toString(nextGreaterElement1(nums1,nums2)));
    }

    static int[] nextGreaterElement1(int[] nums1,int[] nums2){
        int[] arr=new int[nums1.length];

        int ind=0;

        for(int i=0;i<nums1.length;i++){
            int num=nums1[i];

            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==num){
                    int max=LinearSearch(nums2,j+1,nums2.length-1,num);

                    if(max!=-1){
                        arr[ind]=nums2[max];
                        ind++;
                    }else{
                        arr[ind]=-1;
                        ind++;
                    }

                    break;
                }
            }
        }

        return arr;
    }

    static int LinearSearch(int[] nums2,int start,int end,int num){

        for(int i=start;i<=end;i++){
           if(nums2[i]>num){
               return i;
           }
        }

        return -1;
    }
}
