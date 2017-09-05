package implementation;

import common.Exercise;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;
import static java.lang.System.out;

// https://www.hackerrank.com/challenges/angry-professor/problem

class AngryProfessor implements Exercise {

    public void solve() {
        Scanner scanner = new Scanner(in);

        int cases = parseInt(scanner.nextLine());
        for (int i = 0; i < cases; i++) {
            int students = scanner.nextInt();
            int threshold = scanner.nextInt();

            scanner.nextLine();

            int onTimeStudents = 0;
            for (int j = 0; j < students; j++) {
                int arrivalTime = scanner.nextInt();
                if (arrivalTime <= 0) {
                    onTimeStudents++;
                }
            }

            out.println(onTimeStudents >= threshold ? "NO" : "YES");
        }
    }
}
