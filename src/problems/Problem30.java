package problems;

public class Problem30 {
    /*
count the frequency of words in string
     */
    static void approach1(String input){
       String[] words=input.split(" ");
        System.out.println(words.length);
    }
    public static void main(String[] args) {
        approach1("hello world and you are beautiful.");
    }
}
