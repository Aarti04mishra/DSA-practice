package Arrays;
//Input: nums = [3,2,2,3], val = 3
//Output: 2, nums = [2,2,_,_]
//Explanation: Your function should return k = 2, with the first two elements of nums being 2.
//It does not matter what you leave beyond the returned k (hence they are underscores).


import java.util.Arrays;

public class RemoveElements {
    public static void main(String[] args) {
       int[] nums={3,2,2,3};
       int val=3;

        System.out.println(removeElements(nums,val));
    }

    static int removeElements(int[] nums,int val){
        int j=-1;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val && j==-1){
                j=i;
            }
            if(nums[i]!=val){
                count++;
            }
            if(j!=-1 && nums[i]!=val){
                swap(j,i,nums);
                j++;
            }
        }

        return count;

    }

    static void swap(int j,int i,int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
