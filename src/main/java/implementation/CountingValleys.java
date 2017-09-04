package implementation;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;
import static java.lang.System.out;

// https://www.hackerrank.com/challenges/counting-valleys/problem

class CountingValleys {

    public void solve() {
        Scanner scanner = new Scanner(in);

        int stepCount = parseInt(scanner.nextLine());
        String steps = scanner.nextLine();

        int valleys = 0;
        int altitude = 0;
        int prevAltitude;

        for (int i = 0; i < stepCount; i++) {
            char step = steps.charAt(i);
            prevAltitude = altitude;

            if (step == 'U') altitude++;
            if (step == 'D') altitude--;
            if (altitude == 0 && prevAltitude == -1) valleys++;
        }

        out.println(valleys);
    }
}
