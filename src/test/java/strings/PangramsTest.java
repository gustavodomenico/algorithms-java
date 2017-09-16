package strings;

import common.Exercise;
import common.InOutTest;
import org.junit.Test;

public class PangramsTest extends InOutTest {

    private Exercise exercise = new Pangrams();

    private static final String INPUT0 = "We promptly judged antique ivory buckles for the next prize\n";

    private static final String OUTPUT0 = "pangram\n";

    private static final String INPUT1 = "gustavo";

    private static final String OUTPUT1 = "not pangram\n";

    private static final String INPUT_CASE2 = "a";

    private static final String OUTPUT_CASE2 = "not pangram\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        solve(INPUT0, OUTPUT0, exercise);
    }

    @Test
    public void shouldSolveExerciseForSecondTestInput() {
        solve(INPUT1, OUTPUT1, exercise);
    }

    @Test
    public void shouldSolveExerciseForSecondTestCase() {
        solve(INPUT_CASE2, OUTPUT_CASE2, exercise);
    }
}