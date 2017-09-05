package implementation;

import common.Exercise;
import common.InOutTest;
import org.junit.Test;

public class SaveThePrisonerTest extends InOutTest {
    private Exercise exercise = new SaveThePrisoner();

    private static final String INPUT_SAMPLE0 = "4\n" +
            "5 2 1\n" +
            "5 2 2\n" +
            "5 5 3\n" +
            "5 12 4\n";

    private static final String OUTPUT_SAMPLE0 = "2\n" +
            "3\n" +
            "2\n" +
            "5\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        solve(INPUT_SAMPLE0, OUTPUT_SAMPLE0, exercise);
    }
}