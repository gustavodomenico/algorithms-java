package strings;

import common.Exercise;

import java.util.Scanner;
import java.util.Set;

import static java.lang.System.in;
import static java.lang.System.out;
import static java.util.stream.Collectors.toSet;

// https://www.hackerrank.com/challenges/pangrams/problem

class Pangrams implements Exercise {

    private static final int LOWER_A = 97;
    private static final int LOWER_Z = 122;

    public void solve() {
        Scanner scanner = new Scanner(in);

        Set<Character> charSet = scanner.nextLine()
                .toLowerCase()
                .chars()
                .mapToObj(e->(char)e)
                .filter(Character::isAlphabetic)
                .sorted()
                .collect(toSet());


        Character[] array = charSet.toArray(new Character[0]);

        for (int i = LOWER_A, j = 0; i <= LOWER_Z && j < array.length; i++, j++) {
            char current = array[j];
            if (current != (char)i) {
                out.println("not pangram");
                break;
            }
            if (i == 122) {
                out.println("pangram");
            } else  if (j == array.length - 1) {
                out.println("not pangram");
            }
        }
    }
}
