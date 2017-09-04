package implementation;

import common.InOutTest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BirthdayChocolateTest extends InOutTest {
    private BirthdayChocolate exercise = new BirthdayChocolate();

    private static final String INPUT_SAMPLE0 = "5\n" +
            "1 2 1 3 2 \n" +
            "3 2\n";

    private static final String OUTPUT_SAMPLE0 = "2\n";

    private static final String INPUT_SAMPLE1 = "6\n" +
            "1 1 1 1 1 1\n" +
            "3 2\n";

    private static final String OUTPUT_SAMPLE1 = "0\n";

    private static final String INPUT_SAMPLE2 = "6\n" +
            "1 1 1 1 1 1\n" +
            "3 2\n";

    private static final String OUTPUT_SAMPLE2 = "0\n";

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

    @Test
    public void shouldSolveExerciseForThirdTestInput() {
        input(INPUT_SAMPLE2);

        exercise.solve();

        assertThat(output()).isEqualTo(OUTPUT_SAMPLE2);
    }
}