package Array;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        System.out.println(maximumConsecutive(arr,k));
    }

    static int maximumConsecutive(int[] arr,int k){
        int left=0;
        int maxLen=0;
        while(left<arr.length){
            int right=left;
            int count=0;

            while(count<=k && right<arr.length){
                if(arr[right]==0){
                    count++;
                    if(count>k){
                        break;
                    }
                }
                right++;
            }
            if(count>k){
                right--;
            }
            maxLen=Math.max(maxLen,right-left+1);
            left++;
        }
        return maxLen;
    }
}
