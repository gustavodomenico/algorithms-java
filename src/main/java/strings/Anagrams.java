package strings;

// https://www.hackerrank.com/challenges/anagram/problem

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Anagrams {
    int anagram(String s) {
        // String size must be even
        if (s.length() % 2 != 0) return -1;

        // Split the string
        String s1 = s.substring(0, s.length() / 2);
        String s2 = s.substring(s.length() / 2);

        // Create frequency map for s1
        Map<Character, Integer> s1Map = new HashMap<>();
        for (Character c : s1.toCharArray()) s1Map.put(c, s1Map.getOrDefault(c, 0) + 1);

        // Remove all chars from the second half
        for(Character c : s2.toCharArray()) {
            int frequency = s1Map.getOrDefault(c, 0);
            if (frequency > 0) {
                s1Map.put(c, frequency - 1);
            }
        }

        // The sum of missing chars
        return s1Map.values()
                .stream()
                .collect(Collectors.summingInt(Integer::intValue));
    }
}
