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

    @Test
    public void shouldSolveExerciseForBigNumbersInput() {
        input("1000000000 999999999 999999998 999999997 999999996\n");

        exercise.solve();

        assertThat(output()).isEqualTo("3999999990 3999999994\n");
    }

}