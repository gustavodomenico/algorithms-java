package warmup;

import common.AbstractInOutTest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MiniMaxSumTest extends AbstractInOutTest {
    private MiniMaxSum exercise = new MiniMaxSum();

    private static final String INPUT = "1 2 3 4 5\n";

    private static final String OUTPUT = "10 14\n";

    @Test
    public void shouldSolveExerciseForTestInput() {
        input(INPUT);

        exercise.solve();

        assertThat(output()).isEqualTo(OUTPUT);
    }
}