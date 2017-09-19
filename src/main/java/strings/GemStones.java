package strings;

import common.Exercise;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;
import static java.lang.System.out;

// https://www.hackerrank.com/challenges/gem-stones/problem

class GemStones implements Exercise {

    public void solve() {
        Scanner scanner = new Scanner(in);

        Set<Character> gems = new HashSet<>();

        int rocks = parseInt(scanner.nextLine());
        for (int i = 0; i < rocks; i++) {

            char[] rock = scanner
                    .nextLine()
                    .toCharArray();

            Set<Character> current = new HashSet<>();
            for (char aRock : rock) {
                current.add(aRock);
            }

            if (i == 0) {
                gems.addAll(current);
            } else {
                gems.retainAll(current);
            }
        }

        out.println(gems.size());
    }
}
