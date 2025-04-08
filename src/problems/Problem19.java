package problems;

public class Problem19 {
    /*
    count the number of vowels in a string
     */

    static void approach1(String str){
        String vowelsStr="aeiouAEIOU";
        int count=0;
        for(int i=0;i<str.length();i++){
            if(vowelsStr.indexOf(str.charAt(i))!=-1){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        approach1("aeioup");
    }
}
