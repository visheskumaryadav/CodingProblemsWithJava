package problems;

import java.util.LinkedHashSet;
import java.util.Set;

public class Problem7 {
    /*
    Remove duplicate letters from an Array
     */

    static void approach1(String str){
        Set<Character> resultSet=new LinkedHashSet<>();
        for(Character ch:str.toCharArray()){
            //need to check whether lowercase/uppercase character is present or not
            if(!(resultSet.contains(Character.toLowerCase(ch)) || resultSet.contains(Character.toUpperCase(ch))))
                    resultSet.add(ch);
        }
        System.out.println(resultSet);
    }
    public static void main(String[] args) {
        approach1("Javaj");
    }
}
