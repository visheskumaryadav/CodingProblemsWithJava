package problems;

public class Problem2 {
    /*
     * Reverse an integer
     */

    public static void approach1(int a) {
        System.out.println("Initial value:" + a);
        int result = 0;
        int r;
        while (a > 0) {
            r = a % 10;
            result = result * 10 + r;
            a = a / 10;
        }
        System.out.println("Final value:" + result);
    }

    public static void main(String[] args) {
        approach1(254);
    }
}
