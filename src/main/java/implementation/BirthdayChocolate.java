package implementation;


// https://www.hackerrank.com/challenges/the-birthday-bar/problem

import common.Exercise;

import java.util.Scanner;

class BirthdayChocolate implements Exercise {

    static int solve(int n, int[] s, int d, int m){
        int breaks = 0;

        for (int i = 0; i < n; i++) {

            // Sum M pieces
            int sum = 0;
            for (int j = 0; j < m; j++) {
                if (i + j < s.length) {
                    sum += s[i + j];
                }
                else {
                    sum = -1;
                }
            }

            // and check if it is equal to D
            if (sum == d) {
                breaks++;
            }
        }

        return breaks;
    }

    public void solve() {
        // Given code

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }

        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);

        System.out.println(result);
    }
}
