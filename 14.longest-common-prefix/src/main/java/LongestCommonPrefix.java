import java.util.Arrays;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        StringBuilder ans = new StringBuilder();
        
        /// Sort the array alphabetically
        Arrays.sort(strs);

        /// retrieve the first and the last word from the array
        /// used to compare them, as they prefix should contain similarities or else no prefix in common
        String first = strs[0];
        String last = strs[strs.length - 1];

        /// Loop through the shortest word
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            /// if chars not the same return answer.
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }

            /// append the same letter
            ans.append(first.charAt(i));
        }


        return ans.toString();
    }

}


