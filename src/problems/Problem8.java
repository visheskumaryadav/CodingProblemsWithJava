package problems;

public class Problem8 {
    /*
    Validate palindrome
     */
    static void approach1(int n) {
        //using division-reverse the number
        int copy = n;
        int reverseNumber = 0;
        int remainder = 0;
        while (copy > 0) {
            remainder = copy % 10;
            copy = copy / 10;
            reverseNumber = reverseNumber * 10 + remainder;
        }

        if (reverseNumber == n) {
            System.out.println("Its palindrome");
        } else {
            System.out.println("Its not palindrome");
        }
    }

    static void approach2(int n) {
        //By converting the number into string
        String number = String.valueOf(n);
        int l = 0;
        int r = number.length() - 1;
        boolean flag = true;
        while (l < r) {
            char left = number.charAt(l);
            char right = number.charAt(r);
            if (left == right) {
                l++;
                r--;
            } else {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("Its palindrome");
        } else {
            System.out.println("Its not palindrome");
        }
    }

    static void approach2(String text){
        int l = 0;
        int r = text.length() - 1;
        boolean flag = true;
        while (l < r) {
            char left = text.charAt(l);
            char right = text.charAt(r);
            if (left == right) {
                l++;
                r--;
            } else {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("Its palindrome");
        } else {
            System.out.println("Its not palindrome");
        }
    }

    static void approach3(String text) {

        StringBuilder originalString=new StringBuilder(text);
        StringBuilder reversedString=new StringBuilder(text);
        //contentEqual() method checks the content of StringBuilder object
        if (originalString.toString().contentEquals(reversedString.reverse())) {
            System.out.println("Its palindrome");
        } else {
            System.out.println("Its not palindrome");
        }
        System.out.println(originalString);
        System.out.println(reversedString.reverse());
    }


    public static void main(String[] args) {
        approach3("vishesh");

    }


}
