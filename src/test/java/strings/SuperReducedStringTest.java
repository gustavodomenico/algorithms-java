package strings;

import common.Exercise;
import common.InOutTest;
import org.junit.Test;

public class SuperReducedStringTest extends InOutTest {

    private Exercise exercise = new SuperReducedString();

    private static final String INPUT = "aaabccddd\n";

    private static final String OUTPUT = "abd\n";

    private static final String INPUT2 = "aa\n";

    private static final String OUTPUT2 = "Empty String\n";

    private static final String INPUT3 = "baab\n";

    private static final String OUTPUT3 = "Empty String\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        solve(INPUT, OUTPUT, exercise);
    }

    @Test
    public void shouldSolveExerciseForSecondTestInput() {
        solve(INPUT2, OUTPUT2, exercise);
    }

    @Test
    public void shouldSolveExerciseForThirdTestInput() {
        solve(INPUT3, OUTPUT3, exercise);
    }

}