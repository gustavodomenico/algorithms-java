package implementation;

import common.Exercise;
import common.InOutTest;
import org.junit.Test;

public class ExtraLongFactorialsTest extends InOutTest {
    private Exercise exercise = new ExtraLongFactorials();

    private static final String INPUT_SAMPLE0 = "25\n";

    private static final String OUTPUT_SAMPLE0 = "15511210043330985984000000\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        solve(INPUT_SAMPLE0, OUTPUT_SAMPLE0, exercise);
    }
}