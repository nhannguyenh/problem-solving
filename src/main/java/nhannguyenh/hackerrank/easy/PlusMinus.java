package nhannguyenh.hackerrank.easy;

import java.security.InvalidParameterException;
import java.text.DecimalFormat;
import java.util.List;

public class PlusMinus {

    public List<Double> plusMinus(List<Integer> arr) {
        if (arr.isEmpty() || arr.size() > 100) {
            throw new InvalidParameterException("The input array has invalid size value");
        }

        double positiveCount = 0;
        double negativeCount = 0;
        double zeroCount = 0;
        for (Integer item : arr) {
            if (item < -100 || item > 100) {
                throw new IllegalArgumentException(String.format("%d is invalid value", item));
            } else {
                if (item > 0) {
                    positiveCount++;
                } else if (item < 0) {
                    negativeCount++;
                } else {
                    zeroCount++;
                }
            }
        }
        DecimalFormat df = new DecimalFormat("#.######");
        return List.of(
                Double.valueOf(df.format(positiveCount / arr.size())),
                Double.valueOf(df.format(negativeCount / arr.size())),
                Double.valueOf(df.format(zeroCount / arr.size()))
        );
    }
}
