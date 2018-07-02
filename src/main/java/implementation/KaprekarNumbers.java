package implementation;

import java.util.ArrayList;
import java.util.List;

// https://www.hackerrank.com/challenges/kaprekar-numbers/problem

class KaprekarNumbers {
    List<Integer> kaprekarNumbers(int p, int q) {
        List<Integer> result = new ArrayList<>();
        for (int i = p; i <= q; i++) {
            if (isKaprekarNumber(i)) {
                result.add(i);
            }
        }
        return result;
    }

    private boolean isKaprekarNumber(long num) {
        long squared = num * num;

        String digits = String.valueOf(squared);

        String left = digits.substring(0, digits.length() / 2);
        String right = digits.substring(digits.length() / 2);

        int leftNumber = left.isEmpty() ? 0 : Integer.parseInt(left);
        int rightNumber = right.isEmpty() ? 0 : Integer.parseInt(right);

        return num == leftNumber + rightNumber;
    }
}
