package warmup;

import common.Exercise;

import java.util.Objects;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;
import static java.lang.System.out;

// https://www.hackerrank.com/challenges/time-conversion/problem

class TimeConversion implements Exercise {
    public void solve() {
        Scanner scanner = new Scanner(in);

        String time = scanner.nextLine();
        String turn = time.substring(time.length() - 2);
        String timeWithoutTurn = time.substring(0, time.length() - 2);

        String[] slots = timeWithoutTurn.split(":");

        boolean isBeforeNoon = Objects.equals(turn, "AM");

        String result = timeWithoutTurn;
        int hourSlot = parseInt(slots[0]);

        if (isBeforeNoon) {
            if (hourSlot == 12) {
                result = String.format("%s:%s:%s", "00", slots[1], slots[2]);
            }
        } else {
            if (hourSlot == 12) hourSlot = 0;
            result = String.format("%s:%s:%s", 12 + hourSlot, slots[1], slots[2]);
        }

        out.println(result);
    }
}
