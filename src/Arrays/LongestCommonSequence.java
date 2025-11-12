package Arrays;
//Write a function to find the longest common prefix string amongst an array of strings.
//If there is no common prefix, return an empty string "".

//Input: strs = ["flower","flow","flight"]
//Output: "fl"


public class LongestCommonSequence {
    public static void main(String[] args) {
       String[] strs={"dog","racecar","car"};
        System.out.println(longestCommonSequence(strs));

    }

    static String longestCommonSequence(String[] strs){
        String s="";
        int length=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<length){
                length=strs[i].length();
                s=strs[i];
            }
        }

        StringBuffer sb=new StringBuffer();
        int j=0;
        while(j < s.length()){
            char ch=s.charAt(j);
            boolean b=true;
            for(int i=0;i<strs.length;i++){
                if(strs[i].charAt(j)!=ch){
                    b=false;
                    break;
                }
            }

            if(b){
                sb.append(ch);
            }else{
                break;
            }

            j++;
        }

        return sb.toString();
    }
}
