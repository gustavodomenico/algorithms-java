package booking;

import common.Exercise;
import common.InOutTest;
import org.junit.Test;

public class TrianglesTest extends InOutTest {
    private Exercise exercise = new Triangles();

    private static final String INPUT0 = "3 3 3\n";

    private static final String OUTPUT0 = "1\n";

    private static final String INPUT1 = "3 4 5\n";

    private static final String OUTPUT1 = "2\n";

    private static final String INPUT2 = "3 8 3\n";

    private static final String OUTPUT2 = "0\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        solve(INPUT0, OUTPUT0, exercise);
    }

    @Test
    public void shouldSolveExerciseForSecondTestInput() {
        solve(INPUT1, OUTPUT1, exercise);
    }

    @Test
    public void shouldSolveExerciseForThirdTestInput() {
        solve(INPUT2, OUTPUT2, exercise);
    }

}