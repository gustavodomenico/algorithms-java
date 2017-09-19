package sorting;

import common.Exercise;
import common.InOutTest;
import org.junit.Test;

public class BigSortingTest extends InOutTest {

    private Exercise exercise = new BigSorting();

    private static final String INPUT0 = "6\n" +
            "31415926535897932384626433832795\n" +
            "1\n" +
            "3\n" +
            "10\n" +
            "3\n" +
            "5\n";

    private static final String OUTPUT0 = "1\n" +
            "3\n" +
            "3\n" +
            "5\n" +
            "10\n" +
            "31415926535897932384626433832795\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        solve(INPUT0, OUTPUT0, exercise);
    }
}