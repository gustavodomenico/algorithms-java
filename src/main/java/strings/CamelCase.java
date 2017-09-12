package strings;

import common.Exercise;

import java.util.Scanner;

import static java.lang.Character.isUpperCase;
import static java.lang.System.in;
import static java.lang.System.out;

// https://www.hackerrank.com/challenges/camelcase/problem

class CamelCase implements Exercise {

    public void solve() {
        Scanner scanner = new Scanner(in);
        String sentence = scanner.nextLine();

        int words = 0;
        for (char letter : sentence.toCharArray()) {
            if (isUpperCase(letter)) {
                words++;
            }
        }
        out.println(words + 1);
    }
}
