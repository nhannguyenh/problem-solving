package nhannguyenh.geeksforgeeks.easy;

import java.util.ArrayList;
import java.util.List;

public class SubArraySum {

    public List<Integer> subarraySum(int[] arr, int n, int s) {
        int start = 0;
        int currentSum = arr[start];
        List<Integer> result = new ArrayList<>();

        // 1. Go through the array from index 1 to end
        for (int index = 1; index <= n; index++) {
            // 3. If currentSum greater than s, remove the starting element
            while (currentSum > s && start < index - 1) {
                currentSum = currentSum - arr[start];
                start++;
            }

            // 4. Return the result if the currentSum = s
            if (currentSum == s) {
                result.add(0, start + 1);
                result.add(1, index);
                return result;
            }

            // 2. Update the currentSum by adding current element
            if (index < n) {
                currentSum += arr[index];
            }
        }
        result.add(-1);
        return result;
    }
}
