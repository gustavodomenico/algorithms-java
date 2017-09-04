package warmup;

import common.InOutTest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StaircaseTest extends InOutTest {
    private Staircase exercise = new Staircase();

    private static final String INPUT = "6\n";

    private static final String OUTPUT = "     #\n" +
            "    ##\n" +
            "   ###\n" +
            "  ####\n" +
            " #####\n" +
            "######\n";

    @Test
    public void shouldSolveExerciseForTestInput() {
        input(INPUT);

        exercise.solve();

        assertThat(output()).isEqualTo(OUTPUT);
    }
}