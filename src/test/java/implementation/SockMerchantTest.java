package implementation;

import common.InOutTest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SockMerchantTest extends InOutTest {
    private SockMerchant exercise = new SockMerchant();

    private static final String INPUT_SAMPLE0 = "9\n" +
            "10 20 20 10 10 30 50 10 20\n";

    private static final String OUTPUT_SAMPLE0 = "3\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        input(INPUT_SAMPLE0);

        exercise.solve();

        assertThat(output()).isEqualTo(OUTPUT_SAMPLE0);
    }
}