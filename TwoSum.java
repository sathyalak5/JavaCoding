import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // Create a map to store value -> index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If complement exists in map, we found the pair
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Store current number with its index
            map.put(nums[i], i);
        }

        // If no solution found (this shouldn't happen as per problem statement)
        return new int[] {};
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
