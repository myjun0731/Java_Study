import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (i + 1) * 10;
        }
        System.out.println("nums : " + Arrays.toString(nums));

        String[] fruits = {"apple", "banana", "cherry"};
        System.out.println("len  : " + fruits.length);
        System.out.println("first: " + fruits[0]);

        int[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copy);
        System.out.println("sort : " + Arrays.toString(copy));

        int max = nums[0];
        for (int v : nums) {
            if (v > max) max = v;
        }
        System.out.println("max  : " + max);
    }
}
