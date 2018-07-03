package implementation;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinimumDistancesTest {
    private MinimumDistances exercise = new MinimumDistances();

    @Test
    public void shouldSolveForFirstInput() {
        assertThat(exercise.minimumDistances(new int[]{7, 1, 3, 4, 1, 7})).isEqualTo(3);
    }
}