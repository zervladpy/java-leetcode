public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {

        /// Initialize a counter
        int count = 0;

        // start i on 1 because is the second pointer.
        // count points on actual position and i points to the next++ one
        for (int i = 1; i < nums.length; i++) {

            /// If numbers don't match replace the next of i with the new one
            if (nums[count] != nums[i]) {
                count++;
                nums[count] = nums[i];
            }
        }

        // as counter started in 0 and the constraint says that as minimum there will be nums.length > 1
        // we need to add 1
        ++count;

        return count;

    }

}
