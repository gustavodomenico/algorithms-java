package implementation;

import common.Exercise;
import common.InOutTest;
import org.junit.Test;

public class CircularArrayRotationTest extends InOutTest {
    private Exercise exercise = new CircularArrayRotation();

    private static final String INPUT_SAMPLE0 = "3 2 3\n" +
            "1 2 3\n" +
            "0\n" +
            "1\n" +
            "2\n";

    private static final String OUTPUT_SAMPLE0 = "2\n" +
            "3\n" +
            "1\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        solve(INPUT_SAMPLE0, OUTPUT_SAMPLE0, exercise);
    }
}