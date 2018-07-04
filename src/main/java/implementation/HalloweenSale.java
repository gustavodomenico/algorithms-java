package implementation;

// https://www.hackerrank.com/challenges/halloween-sale/problem

public class HalloweenSale {

    int howManyGames(int p, int d, int m, int s) {

        // If you don' have money to buy the first one, we can return
        if (p > s) return 0;

        int moneySpent = 0;
        int games = 0;
        int currentValue = p;

        // While I have not spent all my money
        while(moneySpent <= s) {

            // Reduce the current game value
            moneySpent += currentValue;
            games++;

            // If the value minus the delta is more than m. reduce the delta
            if (currentValue - d > m) {
                currentValue -= d;
            } else { // Otherwise, just reduce m
                currentValue = m;
            }
        }

        // When leave the loop above, we will have bought one extra game...
        return games - 1;
    }
}
