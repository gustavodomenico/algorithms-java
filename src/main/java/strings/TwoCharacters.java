package strings;

// https://www.hackerrank.com/challenges/two-characters/problem

import common.Exercise;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;
import static java.lang.Math.max;
import static java.lang.String.format;
import static java.lang.System.in;
import static java.lang.System.out;

class TwoCharacters implements Exercise {
    public void solve() {
        Scanner scanner = new Scanner(in);

        int length = parseInt(scanner.nextLine());
        String sentence = scanner.nextLine();

        // Unique chars
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < length; i++) {
            charSet.add(sentence.charAt(i));
        }

        Character[] chars = charSet.toArray(new Character[charSet.size()]);

        // Create pattern
        String regexp = "";
        for (int i = 0; i < chars.length; i++) {
            regexp += format("%s(?=%s)", chars[i], chars[i]);
            if (i != chars.length -1) {
                regexp += "|";
            }
        }
        Pattern pattern = Pattern.compile(regexp);

        int result = 0;

        //For each unique pair
        for (int i = 0; i < chars.length; i++) {
            for (int j = i; j < chars.length; j++) {
                Character x = chars[i];
                Character y = chars[j];
                if (x == y) continue;


                String newSentence = remove(sentence, x, y);
                if (!pattern.matcher(newSentence).find()) {
                    result = max(result, newSentence.length());
                }
            }
        }

        out.println(result);
    }

    private String remove(String sentence, Character x, Character y) {
        return sentence.replaceAll(format("[^%s|%s]", x, y), "");
    }
}
