package Array;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums={-1,-1,0,1,1,0};
        System.out.println(findPivotIndex(nums));

    }

    static int findPivotIndex(int[] nums){
        int pre=0;
        int suff=0;
        for(int i=1;i<nums.length;i++){
            suff+=nums[i];
        }

        for(int i=0;i<nums.length;i++){

            if(i!=0) {
                suff-=nums[i];
                pre += nums[i - 1];
            }
            if(suff==pre){
                return i;
            }
        }

        return -1;
    }
}
