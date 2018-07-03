package implementation;

// https://www.hackerrank.com/challenges/beautiful-triplets/problem

public class BeautifulTriples {
   int beautifulTriplets(int d, int[] arr) {
       if (arr.length < 3) {
           return 0;
       }

       int triplets = 0;

       for (int i = 0; i < arr.length - 2; i++) {
           for (int j = i + 1; j < arr.length - 1; j++) {
               if (arr[j] - arr[i] == d) {
                   for (int k = j + 1; k < arr.length; k++) {
                       if (arr[k] - arr[j] == d) {
                           triplets++;
                       }
                   }
               }
           }
       }

       return triplets;
    }
}
