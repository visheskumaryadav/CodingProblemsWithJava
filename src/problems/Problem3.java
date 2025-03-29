package problems;

public class Problem3 {
    /*
  Factorial of a number
   */
    public static void approach1(int n){
        //using for loop
        int result=1;
        for(int i=n;i>0;i--){
            result=result*i;
        }
        System.out.println("Result of "+n+" is "+result);
    }

    public static int approach2(int n){
        //using recursion
        if(n==0){
            return 1;
        }
        return n*approach2(n-1);
    }
    public static void main(String[] args) {
        approach1(5);
        System.out.println(approach2(5));
    }
}
