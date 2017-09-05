package implementation;

import common.Exercise;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/kangaroo/problem

class Kangaroo implements Exercise {

    private static String kangaroo(int x1, int v1, int x2, int v2) {
        if ((x1 < x2) && (v1 < v2))
            return "NO";
        else {
            if ((v1 != v2) && ((x2 - x1) % (v1 - v2)) == 0) {
                return "YES";
            } else {
                return "NO";
            }
        }
    }

    public void solve() {
        // Given code
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();

        String result = kangaroo(x1, v1, x2, v2);

        System.out.println(result);
    }
}
