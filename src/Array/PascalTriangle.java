package Array;

public class PascalTriangle {
    public static void main(String[] args) {
        //find the element at row 5 and col 3
        int r=5;
        int c=3;
        System.out.println("Find Element: ");
        System.out.println(findElement(r-1,c-1));

        //find the nth row
        int n=4;
        System.out.println("Find Row: ");
        findRow(n);

        //Make a Pascal Triangle
        int N=5;
        System.out.println();
        System.out.println("Pascal Triangle: ");
        pascalTriangle(N);

    }

    static void pascalTriangle(int n){
        for(int i=1;i<n;i++){
            findRow(i);
            System.out.println();
        }
    }

    static void findRow(int n){

        int ans=1;
        System.out.print(ans+" ");

        for(int i=1;i<n;i++){
            ans=ans*(n-i);
            ans=ans/i;
            System.out.print(ans+" ");
        }

    }



    static int findElement(int n,int r){
        int res=1;

        for(int i=0;i<r;i++){
            res*=(n-i);
            res/=(i+1);
        }

        return res;
    }
}
