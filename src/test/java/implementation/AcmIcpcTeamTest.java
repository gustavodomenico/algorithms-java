package implementation;

import common.Exercise;
import common.InOutTest;
import org.junit.Test;

public class AcmIcpcTeamTest extends InOutTest {
    private Exercise exercise = new AcmIcpcTeam();

    private static final String INPUT_SAMPLE0 = "4 5\n" +
            "10101\n" +
            "11100\n" +
            "11010\n" +
            "00101\n";

    private static final String OUTPUT_SAMPLE0 = "5\n" +
            "2\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        solve(INPUT_SAMPLE0, OUTPUT_SAMPLE0, exercise);
    }
}