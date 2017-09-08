package implementation;

import common.Exercise;

import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;
import static java.math.BigInteger.ONE;

// https://www.hackerrank.com/challenges/extra-long-factorials/problem

class ExtraLongFactorials implements Exercise {

    private BigInteger factorial(BigInteger bigN) {
        if (bigN.equals(ONE))
            return ONE;

        return bigN.multiply(factorial(bigN.add(ONE.negate())));
    }

    public void solve() {
        Scanner scanner = new Scanner(in);

        long n = scanner.nextLong();

        BigInteger bigN = BigInteger.valueOf(n);
        out.println(factorial(bigN));
    }
}
