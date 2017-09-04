package implementation;

import common.AbstractInOutTest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BonAppetitTest extends AbstractInOutTest {
    private BonAppetit exercise = new BonAppetit();

    private static final String INPUT_SAMPLE0 = "4 1\n" +
            "3 10 2 9\n" +
            "12\n";

    private static final String OUTPUT_SAMPLE0 = "5\n";

    private static final String INPUT_SAMPLE1 = "4 1\n" +
            "3 10 2 9\n" +
            "7\n";

    private static final String OUTPUT_SAMPLE1 = "Bon Appetit\n";

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