package strings;

import common.Exercise;

import java.util.Scanner;

import static java.lang.Character.isAlphabetic;
import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Integer.parseInt;
import static java.lang.System.in;
import static java.lang.System.out;

// https://www.hackerrank.com/challenges/caesar-cipher-1/problem

class CaesarCipher implements Exercise {

    private static final int LOWER_A = 97;
    private static final int LOWER_Z = 122;
    private static final int UPPER_A = 65;
    private static final int UPPER_Z = 90;

    public void solve() {
        Scanner scanner = new Scanner(in);

        int length = parseInt(scanner.nextLine());
        String sentence = scanner.nextLine();
        int rotates = parseInt(scanner.nextLine()) % 26;

        StringBuilder result = new StringBuilder(11);

        for (int i = 0; i < length; i++) {
            char current = sentence.charAt(i);
            if (isAlphabetic(current)) {
                char next = (char)(current + rotates);
                if (isValidBetween(current, next)) {
                    result.append((char) (current + rotates));
                } else if (isLowerCase(current)) {
                    char nextChar = (char)(LOWER_A + (current + rotates - LOWER_Z) - 1);
                    result.append(nextChar);
                } else {
                    char nextChar = (char)(UPPER_A + (current + rotates - UPPER_Z) - 1);
                    result.append(nextChar);
                }
            }
            else {
                result.append(current);
            }
        }
        out.println(result.toString());
    }

    private boolean isValidBetween(char current, char next) {
        return (isLowerCase(current) && next >= LOWER_A && next <= LOWER_Z) ||
                (isUpperCase(current) && next >= UPPER_A && next <= UPPER_Z);
    }
}
