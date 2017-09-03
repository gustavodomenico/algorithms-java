package implementation;

import common.AbstractInOutTest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BreakingtheRecordsTest extends AbstractInOutTest {
    private BreakingtheRecords exercise = new BreakingtheRecords();

    private static final String INPUT_SAMPLE0 = "9\n" +
            "10 5 20 20 4 5 2 25 1\n";

    private static final String OUTPUT_SAMPLE0 = "2 4\n";

    private static final String INPUT_SAMPLE1 = "9\n" +
            "10 5 20 20 4 5 2 25 1\n";

    private static final String OUTPUT_SAMPLE1 = "2 4\n";

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