package strings;

import common.Exercise;
import common.InOutTest;
import org.junit.Test;

public class HackerRankInStringTest extends InOutTest {

    private Exercise exercise = new HackerRankInString();

    private static final String INPUT = "2\n" +
            "hereiamstackerrank\n" +
            "hackerworld\n";

    private static final String OUTPUT = "YES\n" +
            "NO\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        solve(INPUT, OUTPUT, exercise);
    }
}