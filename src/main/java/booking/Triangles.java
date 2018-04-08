package booking;

import common.Exercise;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Triangles implements Exercise{

    private int isTriangle(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                return 1;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public void solve() {
        Scanner scanner = new Scanner(in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        out.println(isTriangle(a, b, c));
    }
}
