public class SqrtX {

    public int mySqrt(int x) {

        /// Edge cases
        if (x == 0 || x == 1) return x;

        /// Assign two pointers for binary search
        int left = 0, right = x;

        /// Meanwhile the pointers don't cross each other
        while (left <= right) {

            /// get the mid value
            int mid = left + (right - left) / 2;

            /// move left pointer to discard less values otherwise discard right values
            if (mid <= x / mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        /// return the max value
        return right;
    }

}
