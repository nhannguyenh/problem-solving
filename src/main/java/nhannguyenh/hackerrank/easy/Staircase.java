package nhannguyenh.hackerrank.easy;

public class Staircase {

    public String staircase(int n) {
        if (n <= 0 || n > 100) {
            throw new IllegalArgumentException(String.format("%d is invalid input value", n));
        }
        StringBuilder stairCase = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            int spaceNumber = n - i;
            stairCase.append(" ".repeat(spaceNumber));
            stairCase.append("#".repeat(n - spaceNumber));
            if (i < n) {
                stairCase.append("\n");
            }
        }
        return stairCase.toString();
    }
}
