package sorting;

import common.Exercise;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;
import static java.lang.System.out;

// https://www.hackerrank.com/challenges/tutorial-intro/problem

class IntroTutorialChallenges implements Exercise {

    public void solve() {
        Scanner scanner = new Scanner(in);

        int value = parseInt(scanner.nextLine());
        int size = parseInt(scanner.nextLine());

        for (int i = 0; i < size; i++) {
            int current = scanner.nextInt();
            if (current == value) {
                out.println(i);
                break;
            }
        }
    }
}
