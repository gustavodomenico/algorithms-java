package codility;

import java.util.HashMap;
import java.util.Map;

class OddOccurrencesInArray {
    public int solution(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int aA : A) {
            map.put(aA, map.getOrDefault(aA, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() % 2 != 0) {
                return e.getKey();
            }
        }

        return -1;
    }
}
