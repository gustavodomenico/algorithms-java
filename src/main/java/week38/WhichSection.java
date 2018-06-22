package week38;

// https://www.hackerrank.com/contests/w38/challenges/which-section

class WhichSection {
    int whichSection(int n, int k, int[] a) {
        int studentPosition = k;

        // For each position
        for (int i = 0; i < a.length; i++) {
            int currentSectionSize = a[i];

            // Decrease the position based on the slot size
            studentPosition -= currentSectionSize;

            // If the position is equal or less than 0, this is the slot
            if (studentPosition <= 0) return i + 1;
        }

        // This is lot likely to happen, but if there is no space in the array, return the max slot
        return a.length;
    }
}
