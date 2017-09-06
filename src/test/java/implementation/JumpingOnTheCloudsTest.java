package implementation;

import common.Exercise;
import common.InOutTest;
import org.junit.Test;

public class JumpingOnTheCloudsTest extends InOutTest{
    private Exercise exercise = new JumpingOnTheClouds();

    private static final String INPUT_SAMPLE0 = "8 2\n" +
            "0 0 1 0 0 1 1 0\n";

    private static final String OUTPUT_SAMPLE0 = "92\n";

    private static final String INPUT_CASE1 = "24 3\n" +
            "0 1 1 0 1 0 1 1 0 1 1 0 0 0 0 0 1 1 1 1 1 0 1 0\n";

    private static final String OUTPUT_CASE1 = "86\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        solve(INPUT_SAMPLE0, OUTPUT_SAMPLE0, exercise);
    }

    @Test
    public void shouldSolveExerciseForFirstTestCase() {
        solve(INPUT_CASE1, OUTPUT_CASE1, exercise);
    }

}