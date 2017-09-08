package strings;

import common.Exercise;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

// https://www.hackerrank.com/challenges/reduced-string/problem

class SuperReducedString implements Exercise {

    public void solve() {
        Scanner scanner = new Scanner(in);
        String sentence = scanner.nextLine();

        StringBuilder builder = new StringBuilder(sentence);

        int i  = 0;
        while(!sentence.equals("") && i + 1 < sentence.length()) {
            if (sentence.charAt(i) == sentence.charAt(i + 1)) {
                builder.deleteCharAt(i);
                builder.deleteCharAt(i);

                sentence = builder.toString();
                i = 0;
            } else {
                i++;
            }
        }

        out.println(sentence.equals("") ? "Empty String" : sentence);
    }
}
