package strings;

import common.Exercise;
import common.InOutTest;
import org.junit.Test;

public class CamelCaseTest extends InOutTest {

    private Exercise exercise = new CamelCase();

    private static final String INPUT = "saveChangesInTheEditor\n";

    private static final String OUTPUT = "5\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        solve(INPUT, OUTPUT, exercise);
    }
}