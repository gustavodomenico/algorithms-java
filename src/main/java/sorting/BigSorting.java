package sorting;

import common.Exercise;

import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;
import static java.lang.System.out;
import static java.util.Arrays.sort;

// https://www.hackerrank.com/challenges/big-sorting/problem

class BigSorting implements Exercise {
    public void solve() {
        Scanner scanner = new Scanner(in);

        int numbers = parseInt(scanner.nextLine());

        BigInteger[] array = new BigInteger[numbers];
        for (int i = 0; i < numbers; i++) {
            array[i] = scanner.nextBigInteger();
        }

        sort(array);

        for (int i = 0; i < numbers; i++) {
            out.println(array[i]);
        }
    }
}
