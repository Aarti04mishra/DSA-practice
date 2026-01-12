package Array;

public class FindMaxAverage {
    public static void main(String[] args) {
        int[] arr={1,12,-5,-6,50,3};
        int k=4;

        System.out.println(maxAverage(arr,k));
    }

    static double maxAverage(int[] nums,int k){
        double max=0;

        for(int i=0;i<=nums.length-k;i++){
            int sum=0;

            for(int j=i;j<i+k;j++){
                sum+=nums[j];
            }
            max=Math.max(max,(double)sum/k);
            System.out.println(max);
        }

        return max;
    }
}
