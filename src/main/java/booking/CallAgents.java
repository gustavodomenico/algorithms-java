package booking;

import common.Exercise;

import java.util.Scanner;

import static java.lang.Integer.max;
import static java.lang.Integer.parseInt;
import static java.lang.System.in;
import static java.lang.System.out;

class CallAgents  implements Exercise {
    private int howManyAgentsToAdd(int noOfCurrentAgents, int[][] callsTimes) {
        int maxAgents = 0;

        for (int i = 0; i < callsTimes.length; i++) {
            int agents = 1;

            int currentStart = callsTimes[i][0];

            for (int j = 0; j < i; j++) {
                int compareFinish = callsTimes[j][1];
                if (currentStart < compareFinish) {
                    agents++;
                }
            }

            maxAgents = max(maxAgents, agents);
        }

        return maxAgents - noOfCurrentAgents;
    }

    @Override
    public void solve() {
        Scanner scanner = new Scanner(in);

        int agents = parseInt(scanner.nextLine());
        int callRows = parseInt(scanner.nextLine());
        int callColumns = parseInt(scanner.nextLine()); // Always 2

        int[][] calls = new int[callRows][callColumns];
        for (int i = 0; i < callRows; i++) {
            calls[i][0] = scanner.nextInt();
            calls[i][1] = scanner.nextInt();

            scanner.nextLine();
        }

        out.println(howManyAgentsToAdd(agents, calls));
    }
}
