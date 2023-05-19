package nhannguyenh.hackerrank.easy;

import java.util.List;

public class AVeryBigSum {

    public long aVeryBigSum(List<Long> ar) {
        return ar.stream()
                .mapToLong(Long::longValue)
                .sum();
    }
}
