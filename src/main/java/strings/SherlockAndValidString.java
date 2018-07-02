package strings;

// https://www.hackerrank.com/challenges/sherlock-and-valid-string

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class SherlockAndValidString {
    String isValid(String s) {
        // Build frequency map by char
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            int charFrequency = frequencyMap.getOrDefault(c, 0) + 1;
            frequencyMap.put(c, charFrequency);
        }

        Set<Integer> frequenciesSet = new HashSet<>(frequencyMap.values());

        // If there is more than 2 frequencies, return false
        if (frequenciesSet.size() > 2) {
            return "NO";
        }

        // If there is just one frequency return true
        if (frequenciesSet.size() == 1) {
            return "YES";
        }

        // Get the frequencies
        int frequency1 = 0;
        int frequency2 = 0;

        int index = 0;
        for (Integer frequency : frequenciesSet) {
            if (index == 0) {
                frequency1 = frequency;
                index++;
            } else {
                frequency2 = frequency;
            }
        }

        // Get the frequency count
        int frequency1Count = 0;
        int frequency2Count = 0;

        for (Integer frequency : frequencyMap.values()) {
            if (frequency == frequency1) frequency1Count++;
            if (frequency == frequency2) frequency2Count++;
        }

        // If one of the frequencies is 1, we can return true
        if ((frequency1 == 1 && frequency1Count == 1) || (frequency2 == 1 && frequency2Count == 1)) {
            return "YES";
        }

        // If the frequencies difference is one, and one of them is 1, we can return true
        if (Math.abs(frequency1 - frequency2) == 1 && (frequency1Count == 1 || frequency2Count == 1)) {
            return "YES";
        }

        // Else, return false...
        return "NO";
    }
}
