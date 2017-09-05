package warmup;

import common.Exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;
import static java.lang.System.out;

// https://www.hackerrank.com/challenges/birthday-cake-candles/problem

class BirthdayCakeCandles implements Exercise {
    public void solve() {
        Scanner scanner = new Scanner(in);

        int candles = parseInt(scanner.nextLine());

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < candles; i++) {
            int height = scanner.nextInt();

            if (!map.containsKey(height)) map.put(height, 1);
            else map.put(height, map.get(height) + 1);
        }

        int max = map.values().stream().reduce(Integer::max).orElse(0);
        out.format("%s\n", max);
    }
}
