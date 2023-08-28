package nhannguyenh.leetcode.easy;

import java.util.Arrays;

public class SquaresSortedArray {

    public int[] sortedSquares(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .mapToInt(e -> e * e)
                .sorted()
                .toArray();
    }
}
