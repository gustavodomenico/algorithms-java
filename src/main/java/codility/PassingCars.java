package codility;

class PassingCars {
    public int solution(int[] A) {
        int goingEast = 0;
        int passingCars = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                goingEast++;
            } else {
                passingCars += goingEast;
            }

            if (passingCars > 1000000000) {
                return -1;
            }
        }

        return passingCars;
    }
}
