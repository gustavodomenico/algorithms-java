package warmup;

import common.AbstractInOutTest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BirthdayCakeCandlesTest extends AbstractInOutTest {
    private BirthdayCakeCandles exercise = new BirthdayCakeCandles();

    private static final String INPUT = "4\n" +
            "3 2 1 3\n";

    private static final String OUTPUT = "2\n";

    @Test
    public void shouldSolveExerciseForTestInput() {
        input(INPUT);

        exercise.solve();

        assertThat(output()).isEqualTo(OUTPUT);
    }
}