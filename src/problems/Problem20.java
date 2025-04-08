package problems;

public class Problem20 {
    /*
    Separate numeric value and string values
     */

    static void approach1(String str){
        char[] chArr=str.toCharArray();
        StringBuilder string=new StringBuilder("");
        StringBuilder intString=new StringBuilder("");
        for(char ch:chArr){
            if(Character.isAlphabetic(ch)){
                string.append(ch);
            }
            if(Character.isDigit(ch)){
                intString.append(ch);
            }
        }
        System.out.println("String: "+string.toString());
        System.out.println("String with only integer: "+intString.toString());

    }

    public static void main(String[] args) {
        approach1("hello5435jrnunn");
    }
}
