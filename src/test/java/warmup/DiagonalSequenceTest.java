package warmup;

import common.InOutTest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DiagonalSequenceTest extends InOutTest {

    private DiagonalSequence exercise = new DiagonalSequence();

    private static final String INPUT = "3\n" +
            "11 2 4\n" +
            "4 5 6\n" +
            "10 8 -12\n";

    private static final String OUTPUT = "15\n";

    @Test
    public void shouldSolveExerciseForTestInput() {
        input(INPUT);

        exercise.solve();

        assertThat(output()).isEqualTo(OUTPUT);
    }
}
