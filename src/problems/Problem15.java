package problems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem15 {
    /*
    calculate the sum of numbers from the string
     */

    static void approach1(String str){

        Pattern pattern= Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        int sum=0;
        while(matcher.find()){
            System.out.println("Found:"+matcher.group());
            sum+=Integer.parseInt(matcher.group());
        }
        System.out.println("Sum:"+sum);
    }

    public static void main(String[] args) {
        approach1("There are 1 apples and 3 bananas7.");
    }
}
