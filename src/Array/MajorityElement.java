package Array;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr={2,2,3,3,1,2,2,2};
        System.out.println(majorityElement(arr));
    }

    static int majorityElement(int[] arr){
        int count=0;
        int el=arr[0];
        for(int i=0;i<arr.length;i++){
            if(count==0){
                el=arr[i];
            }else if(arr[i]==el){
                count++;
            }else{
                count=0;
            }
        }

        int major=0;
        for(int i=0;i<arr.length;i++){
            if(el==arr[i]){
                major++;
            }
        }
        if(major>arr.length/2){
            return el;
        }else{
            return -1;
        }
    }
}
