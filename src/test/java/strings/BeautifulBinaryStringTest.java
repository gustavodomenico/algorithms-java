package strings;

import common.Exercise;
import common.InOutTest;
import org.junit.Test;

public class BeautifulBinaryStringTest extends InOutTest {

    private Exercise exercise = new BeautifulBinaryString();

    private static final String INPUT0 = "7\n" +
            "0101010\n";

    private static final String OUTPUT0 = "2\n";

    private static final String INPUT1 = "5\n" +
            "01100\n";

    private static final String OUTPUT1 = "0\n";

    private static final String INPUT2 = "10\n" +
            "0100101010\n";

    private static final String OUTPUT2 = "3\n";

    private static final String INPUT_CASE4 = "100\n" +
            "0100101010100010110100100110110100011100111110101001011001110111110000101011011111011001111100011101\n";

    private static final String OUTPUT_CASE4 = "10\n";

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

    @Test
    public void shouldSolveExerciseForFourthTestCase() {
        solve(INPUT_CASE4, OUTPUT_CASE4, exercise);
    }
}