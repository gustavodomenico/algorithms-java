package strings;

import common.Exercise;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;
import static java.lang.System.out;

// https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem

class HackerRankInString implements Exercise {

    private static final String HACKERRANK = "hackerrank";

    public void solve() {
        Scanner scanner = new Scanner(in);

        int queries = parseInt(scanner.nextLine());
        for (int i = 0; i < queries; i++) {
            String sentence = scanner.nextLine();
            int k = 0;
            for (int j = 0; j < sentence.length(); j++) {
                char current = sentence.charAt(j);
                if (current == HACKERRANK.charAt(k)) {
                    k++;
                }

                if (k == HACKERRANK.length()) {
                    break;
                }
            }

            out.println(k == HACKERRANK.length() ? "YES" :"NO");
        }
    }
}
