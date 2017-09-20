package strings;

import common.Exercise;
import common.InOutTest;
import org.junit.Test;

public class PalindromeIndexTest extends InOutTest {
    private Exercise exercise = new PalindromeIndex();

    private static final String INPUT = "3\n" +
            "aaab\n" +
            "baa\n" +
            "aaa\n";

    private static final String OUTPUT = "3\n" +
            "0\n" +
            "-1\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        solve(INPUT, OUTPUT, exercise);
    }
}