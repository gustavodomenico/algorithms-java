package warmup;

import common.AbstractInOutTest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlusMinusTest extends AbstractInOutTest {
    private PlusMinus exercise = new PlusMinus();

    private static final String INPUT = "6\n" +
            "-4 3 -9 0 4 1\n";

    private static final String OUTPUT = "0.500000\n" +
            "0.333333\n" +
            "0.166667\n";

    @Test
    public void shouldSolveExerciseForTestInput() {
        input(INPUT);

        exercise.solve();

        assertThat(output()).isEqualTo(OUTPUT);
    }

}