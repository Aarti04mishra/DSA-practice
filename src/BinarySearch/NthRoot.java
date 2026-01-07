package BinarySearch;

public class NthRoot {
    public static void main(String[] args) {
        int n=2;
        int m=25;

        System.out.println(nthRoot(n,m));
    }

    static int nthRoot(int n,int m){
        int low=1;
        int high=m;
        int ans=-1;

        while(low<=high){
            int mid=(low+high)/2;
            int x=pow(mid,n);
            if(x==m){
                return mid;
            }

            if(x<m){
               low=mid+1;
            }else{
                high=mid-1;
            }
        }

        return ans;
    }


    static int pow(int n,int x){
        int ans=1;
        for(int i=0;i<x;i++){
            ans*=n;
        }

        return ans;
    }
}
