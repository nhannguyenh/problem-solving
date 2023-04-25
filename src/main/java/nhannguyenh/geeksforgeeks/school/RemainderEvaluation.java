package nhannguyenh.geeksforgeeks.school;

import java.security.InvalidParameterException;

public class RemainderEvaluation {

    public int findRemainder(int num1, int num2) {
        if (this.isValidFirstNumber(num1) && this.isValidSecondNumber(num2)) {
            return num1 % num2;
        }
        throw new InvalidParameterException("Invalid input values");
    }

    private boolean isValidFirstNumber(int num) {
        return num >= 0 && num <= 1000000;
    }

    private boolean isValidSecondNumber(int num) {
        return num >= 1 && num <= 1000000;
    }
}
