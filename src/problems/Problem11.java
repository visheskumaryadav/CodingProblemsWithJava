package problems;

public class Problem11 {
    /*
    sum of array elements
     */
    static void approach1(int[] arr){
        int sumOfArray=0;
        for (int j : arr) {
            sumOfArray += j;
        }
        System.out.println(sumOfArray);
    }

    public static void main(String[] args) {
        approach1(new int[]{1,2,3,4,5,6});
    }
}
