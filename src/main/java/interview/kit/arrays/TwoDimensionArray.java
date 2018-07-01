package interview.kit.arrays;

// https://www.hackerrank.com/challenges/2d-array/problem?h_l=playlist&slugs%5B%5D=interview&slugs%5B%5D=interview-preparation-kit&slugs%5B%5D=arrays

@SuppressWarnings("PointlessArithmeticExpression")
class TwoDimensionArray {
    int hourglassSum(int[][] arr) {
        int sum = Integer.MIN_VALUE;

        // We just go row - 2 and col - 2...
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr[i].length - 2; j++) {

                // Basically get the hourglass positions like the problem instruct
                // a b c
                //   d
                // e f g
                // Note: pos + 0 is just for clarification

                int a = arr[i][j + 0];
                int b = arr[i][j + 1];
                int c = arr[i][j + 2];

                int d = arr[i + 1][j + 1];

                int e = arr[i + 2][j + 0];
                int f = arr[i + 2][j + 1];
                int g = arr[i + 2][j + 2];

                // Max between the current sum and the maximum already saved
                sum = Math.max(sum, a + b + c + d + e + f + g);
            }
        }

        return sum;
    }
}
