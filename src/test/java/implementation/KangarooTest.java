package implementation;

import common.InOutTest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class KangarooTest extends InOutTest {
    private Kangaroo exercise = new Kangaroo();

    private static final String INPUT_CASE0 = "0 3 4 2\n";
    private static final String OUTPUT_CASE0 = "YES\n";

    private static final String INPUT_CASE1 = "0 2 5 3\n";
    private static final String OUTPUT_CASE1 = "NO\n";

    private static final String INPUT_CASE13 = "112 9563 8625 244\n";
    private static final String OUTPUT_CASE13 = "NO\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        input(INPUT_CASE0);

        exercise.solve();

        assertThat(output()).isEqualTo(OUTPUT_CASE0);
    }

    @Test
    public void shouldSolveExerciseForSecondTestInput() {
        input(INPUT_CASE1);

        exercise.solve();

        assertThat(output()).isEqualTo(OUTPUT_CASE1);
    }

    @Test
    public void shouldSolveExerciseForResult13() {
        input(INPUT_CASE13);

        exercise.solve();

        assertThat(output()).isEqualTo(OUTPUT_CASE13);
    }
}