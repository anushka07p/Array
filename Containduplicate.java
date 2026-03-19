import java.util.Arrays;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);  // sort array

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;  // duplicate found
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2};

        if (containsDuplicate(arr)) {
            System.out.println("Contains Duplicate");
        } else {
            System.out.println("No Duplicate");
        }
    }
}
