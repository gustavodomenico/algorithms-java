package week38;

// https://www.hackerrank.com/contests/w38/challenges/which-section

class WhichSection {
    int whichSection(int n, int k, int[] a) {
        int studentPosition = k;
        for (int i = 0; i < a.length; i++) {
            int currentSectionSize = a[i];

            studentPosition -= currentSectionSize;
            if (studentPosition <= 0) return i + 1;
        }
        return a.length;
    }
}
