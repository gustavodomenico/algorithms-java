package implementation;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/sock-merchant/problem

class SockMerchant {

    private static int sockMerchant(int n, int[] ar) {
        if (n == 1) {
            return 0;
        }

        int matches = 0;
        for (int i = 0; i < n; i++) {
            if (ar[i] == -1) {
                continue;
            }

            for (int j = 0; j < n; j++) {
                if (ar[i] == ar[j] && i != j) {
                    matches++;
                    ar[i] = -1;
                    ar[j] = -1;
                    break;
                }
            }
        }

        return matches;
    }

    public void solve() {
        // Given code

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }

        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
