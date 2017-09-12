package strings;

import common.Exercise;
import common.InOutTest;
import org.junit.Test;

public class TwoCharactersTest extends InOutTest {
    private Exercise exercise = new TwoCharacters();

    private static final String INPUT = "10\n" +
            "beabeefeab\n";

    private static final String OUTPUT = "5\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        solve(INPUT, OUTPUT, exercise);
    }
}