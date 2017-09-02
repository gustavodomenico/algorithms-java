package implementation;

import common.AbstractInOutTest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BetweenTwoSetsTest extends AbstractInOutTest {

    private BetweenTwoSets exercise = new BetweenTwoSets();

    private static final String INPUT = "2 3\n" +
            "2 4\n" +
            "16 32 96\n";

    private static final String OUTPUT = "3\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        input(INPUT);

        exercise.solve();

        assertThat(output()).isEqualTo(OUTPUT);
    }


}