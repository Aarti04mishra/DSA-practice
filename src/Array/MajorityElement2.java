package Array;

import java.util.ArrayList;

public class MajorityElement2 {
    public static void main(String[] args) {
        int[] arr={2,1,1,1,3,1,2,2,3,2};

        System.out.println(majorityElement(arr));
    }

    //Optimal
    static ArrayList<Integer> majorityElement(int[] arr){
        int cnt1=0;
        int cnt2=0;
        int el1=0;
        int el2=0;

        for(int i=0;i<arr.length;i++){
            if(cnt1==0 && arr[i]!=el2){
                cnt1=1;
                el1=arr[i];
            }else if(cnt2==0 && arr[i]!=el1){
                cnt2=1;
                el2=arr[i];
            }else if(el1==arr[i]){
                cnt1++;
            }else if(el2==arr[i]){
                cnt2++;
            }else{
                cnt1--;
                cnt2--;
            }
        }

        int n=arr.length/3;
        int count1=0;
        int count2=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==el1){
                count1++;
            }else if(arr[i]==el2){
                count2++;
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();

        if(count1>n){
            ans.add(el1);
        }

        if(count2>n){
            ans.add(el2);
        }

        return ans;
    }
}
