package Basic_Maths;

public class GCD {
    public static void main(String[] args) {
        int n1=20;
        int n2=40;

//        System.out.println(gcd(n1,n2));
        System.out.println(gcd2(n1,n2));
    }

    static int gcd(int n1,int n2){
        int gcd=1;

        for(int i=Math.min(n1,n2);i>=1;i--){
            if((n1%i==0) && (n2%i==0)){
                gcd=i;
                break;
            }

        }

        return gcd;
    }

    static int gcd2(int n1,int n2){
        while(n1>0 && n2>0){
            if(n1>n2){
                n1=n1%n2;
            }else{
                n2=n2%n1;
            }
        }

        if(n1==0){
            return n2;
        }else{
            return n1;
        }
    }
}
