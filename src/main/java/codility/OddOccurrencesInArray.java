package codility;

import java.util.HashMap;
import java.util.Map;

class OddOccurrencesInArray {
    public int solution(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();

        // Create the frequency map
        for (int aA : A) {
            map.put(aA, map.getOrDefault(aA, 0) + 1);
        }

        // For each entry, if we have an odd frequency, return the value
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() % 2 != 0) {
                return e.getKey();
            }
        }

        return -1;
    }
}
