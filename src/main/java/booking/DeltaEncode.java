package booking;

import common.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.lang.Math.abs;
import static java.lang.System.in;
import static java.lang.System.out;
import static java.util.stream.Stream.of;

class DeltaEncode implements Exercise {

    private int[] deltaEncode(int[] array) {
        List<Integer> result = new ArrayList<>();

        if (array.length > 0) {
            result.add(array[0]);
        }

        if (array.length > 1) {
            for (int i = 1; i < array.length; i++) {
                int delta = abs(array[i] - array[i - 1]);
                if (delta > 127) {
                    result.add(-128);
                }
                result.add(delta);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

    @Override
    public void solve() {
        Scanner scanner = new Scanner(in);

        int[] array = of(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String result = IntStream.of(deltaEncode(array))
                .mapToObj(String::valueOf)
                .reduce("", (a, b) -> a + " " + b);

        out.println(result.trim());
    }
}
