package implementation;

import common.Exercise;
import common.InOutTest;
import org.junit.Test;

public class EqualizeTheArrayTest extends InOutTest {
    private Exercise exercise = new EqualizeTheArray();

    private static final String INPUT_SAMPLE0 = "5\n" +
            "3 3 2 1 3\n";

    private static final String OUTPUT_SAMPLE0 = "2\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        solve(INPUT_SAMPLE0, OUTPUT_SAMPLE0, exercise);
    }
}