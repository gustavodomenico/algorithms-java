package implementation;

import common.Exercise;
import common.InOutTest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UtopianTreeTest extends InOutTest {
    private Exercise exercise = new UtopianTree();

    private static final String INPUT_SAMPLE0 = "3\n" +
            "0\n" +
            "1\n" +
            "4\n";

    private static final String OUTPUT_SAMPLE0 = "1\n" +
            "2\n" +
            "7\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        input(INPUT_SAMPLE0);

        exercise.solve();

        assertThat(output()).isEqualTo(OUTPUT_SAMPLE0);
    }

}