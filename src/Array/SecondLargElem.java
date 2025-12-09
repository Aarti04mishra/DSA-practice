package Array;

public class SecondLargElem {
    public static void main(String[] args) {
        int[] arr={1,2,4,8,7,6};
        System.out.println(secLaElem(arr));
    }

    static int secLaElem(int[] arr){
        int first=arr[0];
        int second=-1;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }else if(arr[i]<first && arr[i]>second){
                second=arr[i];
            }
        }

        return second;
    }
}
