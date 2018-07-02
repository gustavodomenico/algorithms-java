package basic;

class BinarySearch {

    private int bsRecursive(int[] array, int n, int from, int to) {
        int mid = (from + to) / 2;

        // Stop criteria
        if (from > to) {
            return -1;
        }

        if (array[mid] == n) {          // Return the index if we found it
            return mid;
        } else if (array[mid] < n) {    // If the middle value is less than N, search in the right slice
            return bsRecursive(array, n, mid + 1, to);
        } else {                        // If the middle value is larger than N, search in the left slice
            return bsRecursive(array, n, from, mid - 1);
        }
    }

    private int bsIterative(int[] array, int n) {
        int index = -1, from = 0, to = array.length;

        while (from <= to) {
            int mid = (from + to) / 2;

            if (array[mid] == n) {         // Return the index if we found it
                index = mid;
                break;
            } else if (array[mid] < n) {   // If the middle value is less than N, search in the right slice
                from = mid + 1;
            } else {                       // If the middle value is larger than N, search in the left slice
                to = mid - 1;
            }

        }
        return index;
    }

    int binarySearch(int[] array, int n) {
        //return bsRecursive(array, n, 0, array.length);
        return bsIterative(array, n);
    }
}
