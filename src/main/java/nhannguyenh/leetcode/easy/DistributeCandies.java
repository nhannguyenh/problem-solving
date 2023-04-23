package nhannguyenh.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {

    public int distributeCandies(int[] candyType) {
        if (this.isValidLength(candyType.length)) {
            Set<Integer> candies = new HashSet<>();
            int maxCandiesType = candyType.length / 2;
            for (Integer candy : candyType) {
                if (candies.size() < maxCandiesType) {
                    candies.add(candy);
                }
            }
            return candies.size();
        }
        return -1;
    }

    private boolean isValidLength(int length) {
        return length >= 2 && length <= 10000 && length % 2 == 0;
    }
}
