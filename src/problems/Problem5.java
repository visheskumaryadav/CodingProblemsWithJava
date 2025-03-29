package problems;

public class Problem5 {
/*
 Find that number is armstrong or not
 */
    public static void approach1(int n){
        int copy=n;int result=0;
        while(copy>0){
            int lastDigit=copy%10;
            copy=copy/10;
            result=result+(lastDigit*lastDigit*lastDigit);
        }
        if(n==result){
            System.out.println("Its ArmStrong");
        }else{
            System.out.println("Its not armstrong");
        }
    }
    public static void main(String[] args) {
        approach1(154);
    }
}
