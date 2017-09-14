package implementation;

import common.Exercise;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;
import static java.lang.System.out;

// https://www.hackerrank.com/challenges/acm-icpc-team/problem

class AcmIcpcTeam implements Exercise {

    public void solve() {
        Scanner s = new Scanner(in);

        String[] firstLine = s.nextLine().split(" ");

        int people = parseInt(firstLine[0]);
        int topics = parseInt(firstLine[1]);

        int[][] a = new int[people][topics];
        for (int i = 0; i < people; i++) {
            int[] currentArray = new int[topics];
            String currentTopicList = s.nextLine();
            for (int j = 0; j < currentTopicList.length(); j++) {
                currentArray[j] = parseInt(currentTopicList.charAt(j) + "");
            }
            a[i] = currentArray;
        }

        int highest = -1;
        int bestTeams = 0;

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int knowledge = 0;
                for (int x = 0; x < topics; x++) {
                    knowledge += (a[i][x] == 1 || a[j][x] == 1) ? 1 : 0;
                }
                if (knowledge > highest) {
                    highest = knowledge;
                    bestTeams = 1;
                } else if (knowledge == highest) {
                    bestTeams += 1;
                }
            }
        }
        out.println(highest);
        out.println(bestTeams);
    }
}
