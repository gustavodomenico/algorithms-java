package implementation;

import common.Exercise;

import java.util.Scanner;

import static java.lang.System.out;

// https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem

class JumpingOnTheClouds implements Exercise {

    public void solve() {
        // Given code

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];

        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }

        // Solution

        int energy = 100;
        for (int i = 0; i < n; i += k) {
            energy--;
            if (c[(i + k) % n] == 1) {
                energy -= 2;
            }
        }
        out.println(energy);
    }
}
