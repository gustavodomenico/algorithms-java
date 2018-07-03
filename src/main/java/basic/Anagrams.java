package basic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import static java.util.Collections.singletonList;

class Anagrams {
    boolean areAnagrams(String s1, String s2) {
        // The strings must have the same size
        if (s1.length() != s2.length()) {
            return false;
        }

        // Build frequency map for s1
        Map<Character, Integer> s1Map = new HashMap<>();
        for (Character c : s1.toCharArray()) {
            s1Map.put(c, s1Map.getOrDefault(c, 0) + 1);
        }

        // For each char in s2, decrease the frequency from s1
        for (Character c : s2.toCharArray()) {
            // If the char does not exists, it is not anagrams
            if (!s1Map.containsKey(c)) {
                return false;
            }

            // If the frequency is 0, we have more chars in s2
            int cFrequency = s1Map.get(c);
            if (cFrequency == 0) {
                return false;
            }

            s1Map.put(c, cFrequency - 1);
        }

        // If don' have any chat left in s1Map, they are anagrams
        return new HashSet<>(s1Map.values()).equals(new HashSet<>(singletonList(0)));
    }
}
