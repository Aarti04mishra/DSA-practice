package Recursion;

public class Palindrome {
    public static void main(String[] args) {
        String str="11211";
//        System.out.println(checkPalindrome(str,"",str.length()-1));
        System.out.println(checkPalindrome2(str,0,str.length()));
    }

    static boolean checkPalindrome(String str, String str1, int index){
        if(index<0){
            return str.equals(str1);
        }

        return checkPalindrome(str,str1+str.charAt(index),index-1);
    }

    static boolean checkPalindrome2(String str,int ind,int n){
        if(ind>=n/2){
            return true;
        }

        if(str.charAt(ind)!=str.charAt(n-ind-1)){
            return false;
        }

        return checkPalindrome2(str,ind+1,n);
    }
}
