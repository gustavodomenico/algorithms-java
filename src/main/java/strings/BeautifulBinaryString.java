package strings;

import common.Exercise;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;
import static java.lang.System.out;

// https://www.hackerrank.com/challenges/beautiful-binary-string/problem

class BeautifulBinaryString implements Exercise {

    private static final String PATTERN = "010";

    public void solve() {
        Scanner scanner = new Scanner(in);

        int n = parseInt(scanner.nextLine());
        char[] sentence = scanner.nextLine().toCharArray();

        int changes = 0;
        for (int i = 0; i <= n - PATTERN.length(); i++) {
            for (int k = 0; k < PATTERN.length(); k++) {
                if (sentence[i + k] != PATTERN.charAt(k)) {
                    break;
                }

                if (k == PATTERN.length() - 1) {
                    changes++;
                    sentence[i + k] = 'X';
                }
            }
        }

        out.println(changes);
    }
}
