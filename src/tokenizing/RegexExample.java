package tokenizing;

// Regex is an API to define a pattern for searching or manipulating strings.

import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        // .(dot) represents single character
        System.out.println(Pattern.matches(".r","rr"));// true b/c second char is r in input String
        System.out.println(Pattern.matches("..o","rrh")); // false b/c third char is h in input
        System.out.println(Pattern.matches("[a-z]","R")); // false b/c it will return true only
        // for char a-z range not for A-Z.
        System.out.println(Pattern.matches("[a-z&&[^p]]","p"));// false because of not p ^ is negation
    }
}
