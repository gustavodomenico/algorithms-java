package implementation;

import common.InOutTest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AppleAndOrangeTest extends InOutTest {
    private AppleAndOrange exercise = new AppleAndOrange();

    private static final String INPUT = "7 11\n" +
            "5 15\n" +
            "3 2\n" +
            "-2 2 1\n" +
            "5 -6\n";

    private static final String OUTPUT = "1\n" +
            "1\n";

    @Test
    public void shouldSolveExerciseForTestInput() {
        input(INPUT);

        exercise.solve();

        assertThat(output()).isEqualTo(OUTPUT);
    }
}