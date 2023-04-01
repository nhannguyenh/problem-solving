package nhannguyenh.leetcode.easy;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        int temp = x;
        int reversedX = 0;
        while (temp > 0) {
            int modX = temp % 10;
            reversedX = (reversedX * 10) + modX;
            temp = temp / 10;
        }
        return x == reversedX;
    }
}
