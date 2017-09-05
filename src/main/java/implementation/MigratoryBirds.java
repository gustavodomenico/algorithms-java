package implementation;

import common.Exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/migratory-birds/problem

class MigratoryBirds implements Exercise {

    private static int migratoryBirds(int n, int[] ar) {
        Map<Integer, Integer> typeMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (!typeMap.containsKey(ar[i])) {
                typeMap.put(ar[i], 0);
            }
            typeMap.put(ar[i], typeMap.get(ar[i]) + 1);
        }

        int maxType = 0;
        int maxValue = 0;
        for (Entry<Integer, Integer> entry : typeMap.entrySet()) {
            if (entry.getValue() > maxValue || (entry.getValue() == maxValue && entry.getKey() < maxType)) {
                maxType = entry.getKey();
                maxValue = entry.getValue();
            }
        }

        return maxType;
    }

    public void solve() {
        // Given code

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }

        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
