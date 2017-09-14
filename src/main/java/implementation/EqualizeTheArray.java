package implementation;

import common.Exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;
import static java.lang.System.out;
import static java.util.Collections.max;
import static java.util.Map.Entry.comparingByValue;

// https://www.hackerrank.com/challenges/equality-in-a-array/problem

class EqualizeTheArray implements Exercise {

    public void solve() {
        Scanner scanner = new Scanner(in);

        int n = parseInt(scanner.next());

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();

            if (!map.containsKey(value)) {
                map.put(value, 1);
            } else {
                map.put(value, map.get(value) + 1);
            }
        }

        int maxKeyByValue = max(map.entrySet(), comparingByValue()).getKey();
        int deletions = 0;

        for(Integer k : map.keySet()) {
            if (k != maxKeyByValue) {
                deletions += map.get(k);
            }
        }

        out.println(deletions);
    }
}
