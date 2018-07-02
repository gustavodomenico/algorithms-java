package interview.kit.sorting;

import static java.util.Arrays.sort;

// https://www.hackerrank.com/challenges/mark-and-toys
public class MarkAndToys {
    int maximumToys(int[] prices, int k) {

        // Sort to maximize the number of toys that you can buy
        sort(prices);

        // Just iterate the array, decreasing the price from your budget
        int budget = k;
        for (int i = 0; i < prices.length; i++) {
            budget -= prices[i];
            if (budget <= 0) {
                return i;
            }
        }

        // He can buy everything
        return prices.length;
    }
}
