import java.util.HashMap;

/**
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would <strong>have exactly one solution</strong>,
 * and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 */

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        /// Iterate through all numbers
        for (int i = 0; i < nums.length; i++) {
            /// get the pair for i so it sums target
            int diff = target - nums[i];
            // if the diff is in the map the num is found, so we return it
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            } else {
                /// otherwise we insert the current number in the map
                map.put(nums[i], i);
            }
        }

        /// return null, as no target sum was found
        return null;
    }

}
