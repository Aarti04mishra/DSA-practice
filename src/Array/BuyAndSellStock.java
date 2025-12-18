package Array;

import java.util.Arrays;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        System.out.println(Arrays.toString(buySell(arr)));
    }

    static int[] buySell(int[] arr){
        int [] stock={-1,-1};
        int buy=arr[0];
        int dif=0;
        int sell=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<buy){
                buy=arr[i];
            }else{
                if((arr[i]-buy)>dif){
                    sell=i;
                    dif=arr[i]-buy;
                }
            }
        }

        stock[0]=buy;
        stock[1]=sell;
        return stock;
    }
}
