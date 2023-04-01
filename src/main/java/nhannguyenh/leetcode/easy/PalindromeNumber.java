package nhannguyenh.leetcode.easy;

public class PalindromeNumber {
    private final Double MIN_VALUE = Math.pow(2, -31);
    private final Double MAX_VALUE = Math.pow(2, 31) - 1;

    public boolean isPalindrome(int x) {
        if (x < 0 || x < MIN_VALUE.intValue() || x > MAX_VALUE.intValue()) {
            return false;
        }

        int copyX = x;
        int reversedX = 0;
        while (copyX > 0) {
            int modX = copyX % 10;
            reversedX = (reversedX * 10) + modX;
            copyX = copyX / 10;
        }
        return x == reversedX;
    }
}
