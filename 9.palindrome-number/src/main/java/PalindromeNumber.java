public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        /// if x is negative, it's not a palindrome (-121 and 121- are not the same)
        if (x < 0) return false;

        /// if x is lower than 10 is a palindrome
        if (x < 10) return true;

        /// Getting String value of x
        String xStr = String.valueOf(x);

        /// Setting two pointers for left character and right one
        int left = 0, right = xStr.length() - 1;

        /// Meanwhile the two pointers not match
        /// We don't care about the middle character on an odd string length
        while (left < right) {

            /// we check if they are not the same
            if (xStr.charAt(left) != xStr.charAt(right)) {
                return false;
            }

            /// if they are the same we just continue
            left++;
            right--;
        }

        return true;
    }

    public boolean isPalindromeWithOutString(int x) {

        /// if x is negative, it's not a palindrome (-121 and 121- are not the same)
        if (x < 0) return false;

        /// if x is lower than 10 is a palindrome
        if (x < 10) return true;

        /// initialize a reversed n and the original so we can compare them later
        int reversed = 0, original = x;

        /// we will change x while is grater than 0
        while (x > 0) {
            /// get the last digit
            int lastDigit = x % 10;
            /// append the digit to the end of reversed
            reversed = reversed * 10 + lastDigit;
            /// extract the last digit from x so it not repeats
            x /= 10;
        }

        /// compare both numbers and return if they are the same
        return original == reversed;
    }

}
