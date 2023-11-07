package nhannguyenh.hackerrank.easy;

public class NumberLineJumps {
    public static final String YES = "YES";
    public static final String NO = "NO";

    public String kangaroo(int x1, int v1, int x2, int v2) {
        if (validateInitPositions(x1, x2) && validateJumpDistances(v1, v2)) {
            if (x2 > x1 && v2 > v1) {
                return NO;
            } else {
                do {
                    x1 += v1;
                    x2 += v2;
                    if (x1 == x2) {
                        return YES;
                    }
                } while (x1 < x2);
            }
        }
        return NO;
    }

    private boolean validateInitPositions(int firstPosition, int secondPosition) {
        return validatePosition(firstPosition) && validatePosition(secondPosition);
    }

    private boolean validateJumpDistances(int firstDistance, int secondDistance) {
        return validateJumpDistance(firstDistance) && validateJumpDistance(secondDistance);
    }

    private boolean validatePosition(int position) {
        return position >= 0 && position <= 10000;
    }

    private boolean validateJumpDistance(int jumpDistance) {
        return jumpDistance >= 1 && jumpDistance <= 10000;
    }
}
