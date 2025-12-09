package Array;

public class MaxConsecutive {
    public static void main(String[] args) {
        int[] arr={1,1,0,1,1,1,1,0,1,1};
        System.out.println(maxCons(arr));
    }

    static int maxCons(int[] arr){
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }else{
                max=Math.max(max,count);
                count=0;
            }
        }

        max=Math.max(max,count);

        return max;
    }
}
