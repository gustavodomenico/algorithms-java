package implementation;

import common.AbstractInOutTest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FormingMagicSquareTest extends AbstractInOutTest {
    private FormingMagicSquare exercise = new FormingMagicSquare();

    private static final String INPUT_SAMPLE0 = "4 9 2\n" +
            "3 5 7\n" +
            "8 1 5\n";

    private static final String OUTPUT_SAMPLE0 = "1\n";

    private static final String INPUT_SAMPLE1 = "4 8 2\n" +
            "4 5 7\n" +
            "6 1 6\n";

    private static final String OUTPUT_SAMPLE1 = "4\n";

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