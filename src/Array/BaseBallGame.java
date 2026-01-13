package Array;

import java.util.ArrayList;

public class BaseBallGame {
    public static void main(String[] args) {
        String[] operations={"1","C"};
        System.out.println(baseBallGame(operations));
    }

    static int baseBallGame(String[] operations){
        ArrayList<Integer> num=new ArrayList<>();

        for(int i=0;i<operations.length;i++){
            if(operations[i]=="+"){
                num.add(num.get(num.size()-1)+num.get(num.size()-2));
            }else if(operations[i]=="C"){
               if(!num.isEmpty()){
                   num.removeLast();
               }
            }else if(operations[i]=="D"){
                num.add(num.getLast()*2);
            }else{
                int x=Integer.parseInt(operations[i]);
                num.add(x);
            }
        }
        int sum=0;
        for(int n:num){
            sum+=n;
        }

        return sum;
    }
}
