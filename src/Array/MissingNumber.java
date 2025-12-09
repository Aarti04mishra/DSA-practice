package Array;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={1,2,4,5};
        int n=5;
//        System.out.println(missingNumber(arr));
        System.out.println(missingNumber2(arr,n));
    }

    static int missingNumber(int[] arr){
        int mn=0;
       int[] num=new int[arr.length+2];
       for(int i=0;i<arr.length;i++){
           num[arr[i]]=1;
       }



       for(int i=1;i<num.length;i++){
           if(num[i]==0){
               mn=i;
               break;
           }
       }

       return mn;
    }

    static int missingNumber2(int[] arr,int N){
        int XOR1=0;
        int XOR2=0;

        for(int i=1;i<=N;i++){
            XOR1^=i;
        }

        for(int i=0;i<arr.length;i++){
            XOR2^=arr[i];
        }

        return XOR1^XOR2;
    }
}
