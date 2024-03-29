package nhannguyenh.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    private static final Double MIN_TARGET = Math.pow(-10, 9);
    private static final Double MAX_TARGET = Math.pow(10, 9);

    public int[] twoSum(int[] nums, int target) {
        if (validate(nums, target) && elementValidate(nums)) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int temp = target - nums[i];
                if (map.containsKey(temp)) {
                    return new int[]{map.get(temp), i};
                }
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }

    private boolean validate(int[] nums, int target) {
        boolean firstConstraint = nums.length >= 2 && nums.length <= Math.pow(10, 4);
        boolean secondConstraint = target >= MIN_TARGET.intValue() && target <= MAX_TARGET.intValue();
        return firstConstraint && secondConstraint;
    }

    private boolean elementValidate(int[] nums) {
        int result = Arrays.stream(nums)
                .filter(element -> element <= MIN_TARGET.intValue() || element >= MAX_TARGET.intValue())
                .findFirst()
                .orElse(-1);
        return result == -1;
    }
}
