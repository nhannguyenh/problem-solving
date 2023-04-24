package nhannguyenh.geeksforgeeks.school;

import java.security.InvalidParameterException;

public class SumElementsInMatrix {

    public int sumOfMatrix(int row, int column, int[][] grid) {
        if (this.isValidNumber(row) && this.isValidNumber(column)) {
            int sum = 0;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    if (grid[i][j] >= -1000 && grid[i][j] <= 1000) {
                        sum += grid[i][j];
                    } else {
                        throw new InvalidParameterException("The matrix element is invalid");
                    }
                }
            }
            return sum;
        }
        throw new InvalidParameterException("The matrix is invalid");
    }

    private boolean isValidNumber(int number) {
        return number >= 1 && number <= 1000;
    }
}
