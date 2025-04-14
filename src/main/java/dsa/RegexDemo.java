package dsa;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static boolean CodelandUsernameValidation(String str) {
        // String length should be between 4 and 25
        // must start with a letter
        // cannot end with an underscore
        // can only contain letters, numbers and underscore

        Pattern pattern = Pattern.compile("[a-zA-Z][a-zA-Z0-9_]{2,23}[^_]");
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.println(CodelandUsernameValidation(s.nextLine()));
    }
}
