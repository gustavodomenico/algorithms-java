package implementation;

import java.util.Scanner;

import static java.lang.String.valueOf;

// https://www.hackerrank.com/challenges/bon-appetit/problem

class BonAppetit {

    private static String bonAppetit(int n, int k, int b, int[] ar) {
        int fairAmount = 0;
        for (int i = 0; i < n ; i++) {
            if (i != k) {
                fairAmount+= ar[i];
            }
        }

        if (b == fairAmount / 2) {
            return "Bon Appetit";
        }

        return  valueOf(b - (fairAmount / 2));
    }

    public void solve() {
        // Given code

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }

        int b = in.nextInt();

        String result = bonAppetit(n, k, b, ar);
        System.out.println(result);
    }
}
