package implementation;

import common.AbstractInOutTest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MigratoryBirdsTest extends AbstractInOutTest {
    private MigratoryBirds exercise = new MigratoryBirds();

    private static final String INPUT_SAMPLE0 = "6\n" +
            "1 4 4 4 5 3\n";

    private static final String OUTPUT_SAMPLE0 = "4\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        input(INPUT_SAMPLE0);

        exercise.solve();

        assertThat(output()).isEqualTo(OUTPUT_SAMPLE0);
    }
}