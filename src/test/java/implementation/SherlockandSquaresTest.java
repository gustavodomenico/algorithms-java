package implementation;

import common.Exercise;
import common.InOutTest;
import org.junit.Test;

public class SherlockandSquaresTest extends InOutTest {
    private Exercise exercise = new SherlockandSquares();

    private static final String INPUT = "3\n" +
            "3 9\n" +
            "17 24\n" +
            "100000000 1000000000\n";

    private static final String OUTPUT = "2\n" +
            "0\n" +
            "21623\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        solve(INPUT, OUTPUT, exercise);
    }
}