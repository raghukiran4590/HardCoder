package dsa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuestionMarks {
    //take the str string parameter, which will contain single digit numbers, letters, and question marks,
    // and check if there are exactly 3 question marks between every pair of two numbers that add up to 10.
    public static void main(String[] args) {
        String string = "arrb6??4xxbl5???eee5";
        int start = 0;
        int end = 0;
        String result = "";
        if (string.length() < 5)
            System.out.println("false");
        else {
            char[] chars = string.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (Character.isDigit(chars[i])) {
                    if (i + 4 < chars.length && Character.isDigit(chars[i + 4])) {
                        int num1 = Character.getNumericValue(chars[i]);
                        int num2 = Character.getNumericValue(chars[i + 4]);
                        if ((num1 + num2) == 10 && (chars[i + 1] == '?' && chars[i + 2] == '?' && chars[i + 3] == '?')) {
//                        if(patternMatch(Character.toString(chars[i+1])+Character.toString(chars[i+2])+Character.toString(chars[i+3]))) {
                            result = "true";
                        }
                    }
                }
            }
        }
        if (result.isEmpty())
            result = "false";

        System.out.println(result);
    }

    public static boolean patternMatch(String str) {
        Pattern pattern = Pattern.compile("[???{1,1}]");
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches())
            return true;
        else
            return false;
    }

}
