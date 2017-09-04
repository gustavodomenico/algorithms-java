package implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.out;

// https://www.hackerrank.com/challenges/picking-numbers/problem

class DesignerPDFViewer {

    public void solve() {
        // Given code

        Scanner in = new Scanner(System.in);
        int n = 26;
        int h[] = new int[n];
        for (int h_i = 0; h_i < n; h_i++) {
            h[h_i] = in.nextInt();
        }
        String word = in.next();

        // Solution

        int max = 0;
        int length = word.length();
        Map<Character, Integer> map = new HashMap<>();

        int i = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            map.put(ch, h[i]);
            i++;
        }

        for (int j = 0; j < length; j++) {
            int val = map.get(word.charAt(j));
            if (val > max)
                max = val;
        }

        out.println(max * length);
    }
}
