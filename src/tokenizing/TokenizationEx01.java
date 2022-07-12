package tokenizing;

// Tokenization means splitting a string into several sub-strings based on delimiters.
// For Ex: ac;bc;ef - delimiter is ;
// output - Sub-string 1(ac), Sub-string 2(bc), Sub-string 3(ef)

import java.util.Arrays;

public class TokenizationEx01 {
    public static void main(String[] args) {
        String s = "ab;bc;ef";
        System.out.println(Arrays.toString(s.split(";")));
    }
}
