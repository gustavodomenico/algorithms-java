package warmup;

import common.AbstractInOutTest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DiagonalSequenceTest extends AbstractInOutTest {

    private DiagonalSequence _diagonalSequence = new DiagonalSequence();

    private final String INPUT = "3\n" +
            "11 2 4\n" +
            "4 5 6\n" +
            "10 8 -12\n";

    private final String OUTPUT = "15\n";

    @Test
    public void shouldSolveExerciseForTestInput() {
        input(INPUT);

        _diagonalSequence.solve();

        assertThat(output()).isEqualTo(OUTPUT);
    }
}
