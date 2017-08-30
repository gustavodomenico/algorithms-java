package warmup;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.String.join;
import static java.lang.System.in;
import static java.lang.System.out;
import static java.util.Collections.nCopies;

// https://www.hackerrank.com/challenges/staircase/problem

class Staircase {
    void solve() {
        Scanner scanner = new Scanner(in);

        int ladderSize = parseInt(scanner.nextLine());

        for(int i = 1; i <= ladderSize; i++) {
            String spaces = join("", nCopies(ladderSize - i, " "));
            String ladder = join("", nCopies(i, "#"));

            out.format("%s%s\n", spaces, ladder);
        }
    }
}
