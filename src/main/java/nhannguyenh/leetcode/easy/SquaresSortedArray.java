package nhannguyenh.leetcode.easy;

import java.util.Arrays;

public class SquaresSortedArray {

    public int[] sortedSquares(int[] nums) {
        if (validate(nums)) {
            return Arrays.stream(nums)
                    .boxed()
                    .mapToInt(this::squaredElement)
                    .sorted()
                    .toArray();
        }
        throw new IllegalArgumentException("Input array is not valid");
    }

    private Integer squaredElement(Integer element) {
        if (validateElement(element)) {
            return element * element;
        }
        throw new IllegalArgumentException(String.format("%d is not valid value", element));
    }

    private boolean validate(int[] nums) {
        return nums.length >= 1 && nums.length <= 104;
    }

    private boolean validateElement(int element) {
        return element >= -104 && element <= 104;
    }
}
