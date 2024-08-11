import java.util.HashMap;

public class RomanToInteger {

    public int romanToInt(String s) {

        /// Create a custom dictionary for storing pair (key value) for the translation from roman to int
        HashMap<Character, Integer> dict = new HashMap<>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        int ans = 0;

        /// Loop the String for char comparative
        for (int i = 0; i < s.length(); i++) {
            /// left char is less than right char on our dictionary
            if (i < s.length() - 1 && dict.get(s.charAt(i)) < dict.get(s.charAt(i + 1))) {
                /// if it is we rest it from the answer
                ans -= dict.get(s.charAt(i));
            } else {
                /// Otherwise we add it to the total
                ans += dict.get(s.charAt(i));
            }
        }

        return ans;
    }

}
