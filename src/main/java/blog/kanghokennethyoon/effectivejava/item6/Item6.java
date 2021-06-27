package blog.kanghokennethyoon.effectivejava.item6;

import java.util.regex.Pattern;

public class Item6 {

    public static void main(String[] args) {

        // Don't
        String s = new String("Constant");
        // Do
        s = "Constant";

        // Don't
        // Boolean b = Boolean("true"); // deprecated as of Java 9
        // Do
        Boolean b = Boolean.valueOf("true");

        // Don't
        s.matches("^C");
        // Do
        Pattern pattern = Pattern.compile("^C");
        pattern.matcher(s).matches();

    }
}
