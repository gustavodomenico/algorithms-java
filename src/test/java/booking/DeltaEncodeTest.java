package booking;

import common.Exercise;
import common.InOutTest;
import org.junit.Test;

public class DeltaEncodeTest extends InOutTest {
    private Exercise exercise = new DeltaEncode();

    private static final String INPUT0 = "25626 25757 24367 24267 16 100 2 7277\n";

    private static final String OUTPUT0 = "25626 -128 131 -128 -1390 -100 -128 -24251 84 -98 -128 7275\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        solve(INPUT0, OUTPUT0, exercise);
    }


}