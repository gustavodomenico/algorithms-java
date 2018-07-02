package strings;

// https://www.hackerrank.com/challenges/two-strings/problem?h_l=playlist&slugs%5B%5D=interview&slugs%5B%5D=interview-preparation-kit&slugs%5B%5D=dictionaries-hashmaps

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class TwoStrings {
    String twoStrings(String s1, String s2) {
        // Using hashsets just because the problem is under the dicts & hash section

        Set<Character> set1 = s1.chars().mapToObj(p -> (char)p).collect(Collectors.toSet());
        Set<Character> set2 = s2.chars().mapToObj(p -> (char)p).collect(Collectors.toSet());

        Set<Character> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        return intersection.isEmpty() ? "NO" : "YES";
    }
}
