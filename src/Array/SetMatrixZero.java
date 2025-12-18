package Array;

import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] mat={{1,1,1,1},{1,0,0,1},{1,1,0,1},{1,1,1,1}};
//        setMatrixZero(mat);
//        setMatrixZero2(mat);
          setMatrixZero3(mat);
        for(int i=0;i<mat.length;i++){
            System.out.println(Arrays.toString(mat[i]));
        }
    }
    //Optimal
    static void setMatrixZero3(int[][] mat){
        int col0=1;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    mat[i][0]=0;
                    if(j!=0){
                        mat[0][j]=0;
                    }else{
                        col0=0;
                    }
                }
            }
        }

        for(int i=1;i<mat.length;i++){
            for(int j=1;j<mat[0].length;j++){
                if(mat[i][j]!=0){
                    if(mat[0][j]==0 || mat[i][0]==0){
                        mat[i][j]=0;
                    }
                }
            }
        }

        if(mat[0][0]==0){
            for(int j=0;j<mat[0].length;j++){
                mat[0][j]=0;
            }
        }

        if(col0==0){
            for(int i=0;i<mat.length;i++){
                mat[i][0]=0;
            }
        }
    }


    //Better
    static void setMatrixZero2(int[][] mat){
        int[] row=new int[mat.length];
        int[] col=new int[mat[0].length];

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }

        for(int i=0;i<row.length;i++){
            if(row[i]==1){
                for(int j=0;j<mat[0].length;j++){
                    mat[i][j]=0;
                }
            }
        }

        for(int j=0;j<col.length;j++){
            if(row[j]==1){
                for(int i=0;i<mat.length;i++){
                    mat[i][j]=0;
                }
            }
        }
    }


    // Brute
    static void setMatrixZero(int[][] mat){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    MarkRow(mat,i);
                    MarkCol(mat,j);
                }
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==-1){
                    mat[i][j]=0;
                }
            }
        }
    }

    static void MarkRow(int[][] mat,int i){
        for(int j=0;j<mat[0].length;j++){
            if(mat[i][j]==1){
                mat[i][j]=-1;
            }
        }
    }

    static void MarkCol(int[][] mat,int j){
        for(int i=0;i<mat.length;i++){
            if(mat[i][j]==1){
                mat[i][j]=-1;
            }
        }
    }
}
