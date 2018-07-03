package implementation;

public class MinimumDistances {

    int minimumDistances(int[] a) {
        int minimumDistance = Integer.MAX_VALUE;

        // For each element in the array
        for (int i = 0; i < a.length - 1; i++) {
            // For each sub-sequent element in the array
            for (int j = i + 1; j < a.length; j++) {
                // Compare than and save the minimum distance
                if (a[i] == a[j]) {
                    minimumDistance = Math.min(minimumDistance, Math.abs(j - i));

                    // If it is 1, we can return, it is the best scenario
                    if (minimumDistance == 1) {
                        return minimumDistance;
                    }
                }
            }
        }

        return minimumDistance == Integer.MAX_VALUE ? -1 : minimumDistance;
    }
}
