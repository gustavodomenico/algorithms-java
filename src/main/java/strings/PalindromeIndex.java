package strings;

import common.Exercise;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;
import static java.lang.System.out;

// https://www.hackerrank.com/challenges/palindrome-index/problem

class PalindromeIndex implements Exercise {

    public void solve() {
        Scanner scanner = new Scanner(in);

        int cases = parseInt(scanner.nextLine());
        for (int i = 0; i < cases; i++) {
            String sentence = scanner.nextLine();


            int k1 = 0;
            int k2 = sentence.length() - 1;
            while (k1 < k2) {
                if (sentence.charAt(k1) != sentence.charAt(k2)) {
                    break;
                }
                k1++;
                k2--;
            }

            int index = -1;

            int jFlag = k2;
            int iFlag = k1;
            while (k1 < k2) {
                if (sentence.charAt(k1) != sentence.charAt(k2 - 1)) {
                    index = iFlag;
                    break;
                } else {
                    index = jFlag;
                }
                k1++;
                k2--;
            }

            out.println(index);
        }
    }
}
