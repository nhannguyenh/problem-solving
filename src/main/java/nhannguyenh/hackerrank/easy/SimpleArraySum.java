package nhannguyenh.hackerrank.easy;

import java.util.List;

public class SimpleArraySum {

    public int simpleArraySum(List<Integer> ar) {
        return ar.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
