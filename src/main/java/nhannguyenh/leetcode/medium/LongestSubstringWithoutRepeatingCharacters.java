package nhannguyenh.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        if (!validateStringLength(s) || !validateCharacter(s)) {
            return -1;
        }

        int maxLength = 0;
        Map<Character, Integer> characterMap = new HashMap<>();
        for (int start = 0, end = 0; end < s.length(); end++) {
            Character character = s.charAt(end);
            if (characterMap.containsKey(character)) {
                start = Math.max(characterMap.get(character), start); // NOSONAR
            }
            maxLength = Math.max(maxLength, end - start + 1);
            characterMap.put(character, end + 1);
        }
        return maxLength;
    }

    private boolean validateStringLength(String s) {
        Double maxLength = 5 * Math.pow(10, 4);
        return s.length() <= maxLength.intValue();
    }

    private boolean validateCharacter(String s) {
        String regrex = "[a-zA-Z0-9\s]+"; // NOSONAR
        return s.matches(regrex);
    }
}
