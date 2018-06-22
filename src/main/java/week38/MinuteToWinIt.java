package week38;

// https://www.hackerrank.com/contests/w38/challenges/minute-to-win-it

// a[i] - a[i -1] = k
// a[i] = lk + a[i -1]
// a[i -1] = a[i] - k
class MinuteToWinIt {
    int minuteToWinIt(int[] a, int k) {
        return Math.min(fromLater(a.clone(), k), fromEarlier(a.clone(), k));
    }

    private int fromLater(int[] a, int k) {
        int moves = 0;

        for (int i = 1; i < a.length; i++) {
            int curr = a[i] - a[i - 1];
            if (curr != k) {
                // do again
                a[i] = a[i - 1] + k;
                moves++;
            }
        }

        return moves;
    }

    private int fromEarlier(int[] a, int k) {
        int moves = 0;

        for (int i = 0; i < a.length - 1; i++) {
            int curr = a[i + 1] - a[i];
            if (curr != k) {
                // do again
                a[i] = a[i + 1] - k;
                moves++;
            }
        }

        return moves;
    }
}
