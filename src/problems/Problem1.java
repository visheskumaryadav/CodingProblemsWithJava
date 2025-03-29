package problems;

public class Problem1 {
    /*
     * Swap of two numbers
     */

    public static void approach1(int a, int b) {
        System.out.println("Before swap:\n a->" + a + "b->" + b);
        // using 3rd variable
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("After swap:\n a->" + a + "b->" + b);

    }

    public static void approach2(int a, int b) {
        System.out.println("Before swap:\n a->" + a + " b->" + b);
        // using 2 variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap:\n a->" + a + " b->" + b);
    }

    public static void approach3(int a, int b) {
        System.out.println("Before swap:\n a->" + a + " b->" + b);
        // using bitwise operations
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swap:\n a->" + a + " b->" + b);
    }

    public static void main(String[] args) {
        approach1(10, 6);
        approach2(10, 6);
        approach3(10, 6);

    }

}
