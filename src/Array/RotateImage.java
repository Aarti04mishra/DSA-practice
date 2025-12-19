package Array;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] mat={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rotateImage(mat);

        for(int i=0;i<mat.length;i++){
            System.out.println(Arrays.toString(mat[i]));
        }
    }

    static void rotateImage(int[][] mat){
        //transpose
        for(int i=0;i<mat.length-1;i++){
            for(int j=i+1;j<mat[0].length;j++){
                swap(mat,i,j);
            }
        }

        for(int i =0;i<mat.length;i++){
            reverse(mat,i,0,mat[i].length-1);
        }
    }

    static void reverse(int[][] mat,int i,int start,int end){
        while(start<=end){
            int temp=mat[i][start];
            mat[i][start]=mat[i][end];
            mat[i][end]=temp;

            start++;
            end--;
        }
    }


    static void swap(int[][] mat,int i,int j){
        int temp=mat[i][j];
        mat[i][j]=mat[j][i];
        mat[j][i]=temp;
    }
}
