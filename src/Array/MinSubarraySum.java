package Array;

public class MinSubarraySum {
    public static void main(String[] args) {
        int[] nums={1,1,1,1,1,1,1,1};
        int target=11;
        System.out.println(minSum(nums,target));
    }
    static int minSum(int[] nums,int target){
        int sum=0;
        int index=0;
        int len=nums.length+1;
        for(int i=0;i<nums.length;i++) {
            sum += nums[i];

            if(sum>=target){
                while(sum>=target && index<=i){
                    sum-=nums[index];
                    index++;
                }

                if(sum==target){
                    len=Math.min(len, i-index+1);
                }else{
                    len=Math.min(len,i-index+2);
                }
            }

        }

        if(len==nums.length+1){
            return 0;
        }

        return len;
    }
}
