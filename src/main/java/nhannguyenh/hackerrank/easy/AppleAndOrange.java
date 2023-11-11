package nhannguyenh.hackerrank.easy;

import java.util.Arrays;
import java.util.List;

public class AppleAndOrange {

    /**
     * @param s       starting point of Sam's house location
     * @param t       ending location of Sam's house location
     * @param a       location of the Apple tree
     * @param b       location of the Orange tree
     * @param apples  distances at which each apple falls from the tree
     * @param oranges distances at which each orange falls from the tree
     * @return the number of apples and oranges that land on Sam's house
     */
    public List<Long> countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        long appleCounter = apples.stream()
                .filter(apple -> (a + apple) >= s && (a + apple) <= t)
                .count();
        long orangeCounter = oranges.stream()
                .filter(orange -> (b + orange) >= s && (b + orange) <= t)
                .count();
        return Arrays.asList(appleCounter, orangeCounter);
    }
}
