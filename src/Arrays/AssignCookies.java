package Arrays;

//Input: g = [1,2,3], s = [1,1]
//Output: 1
//Explanation: You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3.
//And even though you have 2 cookies, since their size is both 1, you could only make the child whose greed factor is 1 content.
//You need to output 1.

public class AssignCookies {
    public static void main(String[] args) {
        int[] g={1,2,3};
        int[] s={1,1};
        System.out.println(assignCookies(g,s));
    }

    static int assignCookies(int[] g,int[] s){
        int count=0;
        for(int i=0;i<g.length;i++){
            for(int j=0;j<s.length;j++){
                if(g[i]<=s[j]){
                    s[j]=0;
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}
