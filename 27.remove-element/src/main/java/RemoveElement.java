import java.util.Arrays;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        System.out.println(Arrays.toString(nums));

        int current = 0;

        for (int next = 0; next < nums.length; next++) {
            if (nums[next] != val && nums[current] != val) {
                current += 1;
            } else if (nums[current] == val && nums[next] != val) {
                nums[current] = nums[next];
                nums[next] = val;
                current += 1;
            }
        }

        System.out.println(Arrays.toString(nums));
        return current;
    }

}
