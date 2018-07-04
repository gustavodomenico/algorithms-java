package codility;

class BinaryGap {
    int solution(int N) {
        int number = N;
        int currentGap = 0;
        int maxGap = 0;

        // 100000    - 32
        // 10000     - 16
        // 1000      - 8
        // 100       - 4
        // 10        - 2
        // 1         - 1

        // Remove trailing zeros
        while((number & 1) == 0 && number > 0) {
            number >>= 1;
        }

        // While we have not shifted all bits
        while(number > 0) {
            // If last bit is 0, start counting
            if ((number & 1) == 0) {
                currentGap++;
            } else {
                // else, we check if the current gap is larger than the max gap
                maxGap = Math.max(maxGap, currentGap);
                currentGap = 0;
            }

            // Shift 1 bit to the right (divide by 2)
            number >>= 1;
        }

        return maxGap;
    }
}
