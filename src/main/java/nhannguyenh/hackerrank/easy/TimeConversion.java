package nhannguyenh.hackerrank.easy;

public class TimeConversion {

    public String timeConversion(String s) {
        String hourPart = s.substring(0, 2);
        String minuteSecondPart = s.substring(2, 8);
        String amPmPart = s.substring(8);

        try {
            int hour = Integer.parseInt(hourPart);
            if ("AM".equals(amPmPart) && (hour == 12)) {
                hour = 0;
            } else if ("PM".equals(amPmPart) && hour < 12) {
                hour += 12;
            }
            return String.format("%02d%s", hour, minuteSecondPart);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Input time is invalid");
        }
    }
}
