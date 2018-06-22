package week38;

// https://www.hackerrank.com/contests/w38/challenges/minute-to-win-it

// a[i] - a[i -1] = k
// a[i] = k + a[i -1]
// a[i -1] = a[i] - k

class MinuteToWinIt {
    int minuteToWinIt(int[] a, int k) {
        // Minimum number of moves
        int minMoves = Integer.MAX_VALUE;

        // For each position in the array
        for (int i = 0; i < a.length; i++) {
            // Use the element as a pivot and fix the other parts
            int[] current = a.clone();
            int moves = 0;

            // Fix left side
            if (i > 0) {
                for (int j = i; j > 0; j--) {
                    current[j - 1] = current[j] - k;

                    // If the number is different, we have changed it
                    if (current[j - 1] != a[j - 1]) moves++;
                }
            }

            // Fix right side
            for (int j = i; j < a.length - 1; j++) {
                current[j + 1] = current[j] + k;

                // If the number is different, we have changed it
                if (current[j + 1] != a[j + 1]) moves++;
            }

            minMoves = Math.min(minMoves, moves);
        }

        return minMoves;
    }
}
