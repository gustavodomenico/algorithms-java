package implementation;

import common.Exercise;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

// https://www.hackerrank.com/challenges/apple-and-orange/problem

class AppleAndOrange implements Exercise {

    public void solve() {
        // Given code

        Scanner scanner = new Scanner(in);

        int s = scanner.nextInt();
        int t = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[] apple = new int[m];
        for (int apple_i = 0; apple_i < m; apple_i++) {
            apple[apple_i] = scanner.nextInt();
        }

        int[] orange = new int[n];
        for (int orange_i = 0; orange_i < n; orange_i++) {
            orange[orange_i] = scanner.nextInt();
        }

        // Solution

        int apples = checkInRange(s, t, a, apple);
        int oranges = checkInRange(s, t, b, orange);

        out.println(apples);
        out.println(oranges);
    }

    private int checkInRange(int s, int t, int tree, int[] fruits) {
        int fruitCount = 0;
        for (int fruit : fruits) {
            int distance = tree + fruit;
            if (distance >= s && distance <= t) {
                fruitCount++;
            }
        }
        return fruitCount;
    }
}
