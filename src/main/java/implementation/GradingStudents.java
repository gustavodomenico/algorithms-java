package implementation;

import common.Exercise;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;
import static java.lang.System.out;

// https://www.hackerrank.com/challenges/grading/problem

class GradingStudents implements Exercise {

    public void solve() {
        Scanner scanner = new Scanner(in);

        int grades = parseInt(scanner.nextLine());
        for (int i = 0; i < grades; i++) {
            int grade = parseInt(scanner.nextLine());
            int nextMultiple = ((grade / 5) * 5) + 5;

            if (grade < 38) out.println(grade);
            else if (nextMultiple - grade < 3) out.println(nextMultiple);
            else out.println(grade);
        }
    }
}
