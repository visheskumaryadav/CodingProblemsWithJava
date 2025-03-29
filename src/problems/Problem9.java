package problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Problem9 {
    /*
    WAP for pangram
     */
    static void approach1(String text) {
        // using the concept of hashing
        if (text.length() >= 26) {
            text = text.toLowerCase();
            int[] tmp = new int[26];
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
                    tmp[text.charAt(i) - 'a']++;
                }
            }
            System.out.println(Arrays.toString(tmp));
            boolean flag = true;
            for (int e : tmp) {
                if (e == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("pangram");
            } else {
                System.out.println("not pangram");
            }

        } else {
            System.out.println("not pangram");
        }
    }

    static void approach2(String text) {
        // using hashmap
        if (text.length() >= 26) {
            text = text.toLowerCase();
            Map<Character, Integer> result = new HashMap<>();
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
                    if (result.containsKey(text.charAt(i))) {
                        result.put(text.charAt(i), result.get(text.charAt(i)) + 1);
                    } else {
                        result.putIfAbsent(text.charAt(i), 1);
                    }
                }
            }
            boolean flag = true;
            for (Integer e : result.values()) {
                if (e == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("pangram");
            } else {
                System.out.println("not pangram");
            }

        }else {
            System.out.println("not pangram");
        }
    }

    public static void main(String[] args) {
        approach2("The quick brown fox jumps over the lazy dog.");
//        System.out.println('a'-'a');
    }
}
