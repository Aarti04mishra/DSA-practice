package Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {
    public static void main(String[] args) {
        int num=9;
        System.out.println(pascalTriangle2(num));
    }

    static List<Integer> pascalTriangle2(int num){
        List<Integer> row= new ArrayList<>();
        for(int i=0;i<=num;i++){
            if(i==0 || i==num){
                row.add(1);
            }else if(i==1){
                row.add(num);
            }else{
                int res=num;
                for(int j=2;j<=i;j++){
                   res*=(num-(j-1));
                   res/=j;
                }

                row.add(res);
            }
        }

        return row;
    }
}
