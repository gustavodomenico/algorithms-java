package implementation;

import common.InOutTest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountingValleysTest extends InOutTest {
    private CountingValleys exercise = new CountingValleys();

    private static final String INPUT_SAMPLE0 = "8\n" +
            "UDDDUDUU\n";

    private static final String OUTPUT_SAMPLE0 = "1\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        input(INPUT_SAMPLE0);

        exercise.solve();

        assertThat(output()).isEqualTo(OUTPUT_SAMPLE0);
    }
}