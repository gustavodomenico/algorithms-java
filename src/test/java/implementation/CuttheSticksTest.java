package implementation;

import common.Exercise;
import common.InOutTest;
import org.junit.Test;

public class CuttheSticksTest extends InOutTest {
    private Exercise exercise = new CuttheSticks();

    private static final String INPUT0 = "6\n" +
            "5 4 4 2 2 8\n";

    private static final String OUTPUT0 = "6\n" +
            "4\n" +
            "2\n" +
            "1\n";

    private static final String INPUT1 = "8\n" +
            "1 2 3 4 3 3 2 1\n";

    private static final String OUTPUT1 = "8\n" +
            "6\n" +
            "4\n" +
            "1\n";

    private static final String INPUT_CASE1 = "8\n" +
            "8 8 14 10 3 5 14 12\n";

    private static final String OUTPUT_CASE1 = "8\n" +
            "7\n" +
            "6\n" +
            "4\n" +
            "3\n" +
            "2\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        solve(INPUT0, OUTPUT0, exercise);
    }

    @Test
    public void shouldSolveExerciseForSecondTestInput() { solve(INPUT1, OUTPUT1, exercise); }

    @Test
    public void shouldSolveExerciseForFirstTestCase() { solve(INPUT_CASE1, OUTPUT_CASE1, exercise); }
}