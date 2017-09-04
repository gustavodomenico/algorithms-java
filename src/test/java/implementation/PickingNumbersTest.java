package implementation;

import common.AbstractInOutTest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PickingNumbersTest extends AbstractInOutTest  {
    private PickingNumbers exercise = new PickingNumbers();

    private static final String INPUT_SAMPLE0 = "6\n" +
            "4 6 5 3 3 1\n";

    private static final String OUTPUT_SAMPLE0 = "3\n";

    private static final String INPUT_SAMPLE1 = "6\n" +
            "1 2 2 3 1 2\n";

    private static final String OUTPUT_SAMPLE1 = "5\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        input(INPUT_SAMPLE0);

        exercise.solve();

        assertThat(output()).isEqualTo(OUTPUT_SAMPLE0);
    }

    @Test
    public void shouldSolveExerciseForSecondTestInput() {
        input(INPUT_SAMPLE1);

        exercise.solve();

        assertThat(output()).isEqualTo(OUTPUT_SAMPLE1);
    }

}