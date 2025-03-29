package problems;

public class Problem4 {
/*
Even odd problem
 */
    public static void approach1(int n){
        //using conditional
        if(n%2==0){
            System.out.println("Its even");
        }else{
            System.out.println("Its odd");
        }
    }

    public static void approach2(int n) {
        //using bitwise operator
        if((n & 1)==1){
            System.out.println("its odd");
        }else{
            System.out.println("its even");
        }

    }
    public static void main(String[] args) {
        approach1(78);
        approach2(78);
    }
}
