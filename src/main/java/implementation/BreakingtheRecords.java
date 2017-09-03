package implementation;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem

class BreakingtheRecords {

    private static int[] getRecord(int[] s) {
        int lowest = s[0];
        int highest = s[0];

        int lowestBreaks = 0;
        int highestBreaks = 0;

        if (s.length > 1) {
            for (int i = 1; i < s.length; i++) {
                int score = s[i];

                if (score > highest) {
                    highestBreaks++;
                    highest = score;
                }

                if (score < lowest) {
                    lowestBreaks++;
                    lowest = score;
                }
            }
        }

        return new int[]{highestBreaks, lowestBreaks};
    }

    public void solve() {
        // Given code

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] s = new int[n];
        for (int s_i = 0; s_i < n; s_i++) {
            s[s_i] = in.nextInt();
        }

        int[] result = getRecord(s);

        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }

        System.out.println("");
    }
}
