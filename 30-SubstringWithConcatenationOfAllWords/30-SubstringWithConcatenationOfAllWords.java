// Last updated: 7/9/2026, 3:09:22 PM
import java.util.*;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {

        List<Integer> result = new ArrayList<>();

        if (s.length() == 0 || words.length == 0)
            return result;

        int wordLen = words[0].length();
        int wordCount = words.length;
        int totalLen = wordLen * wordCount;

        if (s.length() < totalLen)
            return result;

        // Frequency of words required
        HashMap<String, Integer> freq = new HashMap<>();

        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        // Try different starting offsets
        for (int offset = 0; offset < wordLen; offset++) {

            int left = offset;
            int right = offset;
            int count = 0;

            HashMap<String, Integer> window = new HashMap<>();

            while (right + wordLen <= s.length()) {

                String word = s.substring(right, right + wordLen);
                right += wordLen;

                if (freq.containsKey(word)) {

                    window.put(word, window.getOrDefault(word, 0) + 1);
                    count++;

                    // Remove extra occurrences
                    while (window.get(word) > freq.get(word)) {
                        String leftWord = s.substring(left, left + wordLen);
                        window.put(leftWord, window.get(leftWord) - 1);
                        left += wordLen;
                        count--;
                    }

                    // Found valid concatenation
                    if (count == wordCount) {
                        result.add(left);

                        // Move left for next possible window
                        String leftWord = s.substring(left, left + wordLen);
                        window.put(leftWord, window.get(leftWord) - 1);
                        left += wordLen;
                        count--;
                    }

                } else {
                    // Word not present, reset window
                    window.clear();
                    count = 0;
                    left = right;
                }
            }
        }

        return result;
    }
}