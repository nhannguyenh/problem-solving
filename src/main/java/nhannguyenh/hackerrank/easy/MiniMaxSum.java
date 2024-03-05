package nhannguyenh.hackerrank.easy;

import java.util.List;

public class MiniMaxSum {

    public String miniMaxSum(List<Integer> arr) {
        List<Integer> sortedArr = arr.stream()
                .sorted()
                .toList();
        int min = sortedArr.get(0);
        int max = sortedArr.get(arr.size() - 1);
        long sum = sortedArr.stream()
                .mapToLong(Integer::longValue)
                .sum();
        return String.format("%d %d", sum - max, sum - min);
    }
}
