package Array;

public class LargestElem {
    public static void main(String[] args) {
        int[] arr={3,2,1,5,2};
        System.out.println(largestElem(arr));
    }

    static int largestElem(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        return max;
    }
}
