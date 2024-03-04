package nhannguyenh.hackerrank.easy;

import java.security.InvalidParameterException;
import java.util.List;

public class BirthdayCakeCandles {

    public int birthdayCakeCandles(List<Integer> candles) {
        if (candles.isEmpty() || candles.size() > 100000) {
            throw new InvalidParameterException("The number of candle is invalid");
        }

        int tallestCandle = candles.stream()
                .mapToInt(Integer::intValue)
                .max()
                .getAsInt();
        return candles.stream()
                .filter(candle -> candle == tallestCandle)
                .toList()
                .size();
    }
}
