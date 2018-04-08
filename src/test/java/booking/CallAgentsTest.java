package booking;

import common.Exercise;
import common.InOutTest;
import org.junit.Test;

public class CallAgentsTest extends InOutTest {
    private Exercise exercise = new CallAgents();

    private static final String INPUT0 = "1\n" +
            "3\n" +
            "2\n" +
            "1481122000 1481122020\n" +
            "1481122000 1481122040\n" +
            "1481122030 1481122035\n";

    private static final String OUTPUT0 = "1\n";

    private static final String INPUT1 = "1\n" +
            "8\n" +
            "2\n" +
            "0 2\n" +
            "0 4\n" +
            "3 4\n" +
            "3 4\n" +
            "4 6\n" +
            "5 8\n" +
            "5 7\n" +
            "6 7\n";

    private static final String OUTPUT1 = "2\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        solve(INPUT0, OUTPUT0, exercise);
    }

    @Test
    public void shouldSolveExerciseForSecondTestInput() {
        solve(INPUT1, OUTPUT1, exercise);
    }
}