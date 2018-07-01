package interview.kit.arrays;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinimumSwaps2Test {
    private MinimumSwaps2 exercise = new MinimumSwaps2();

    @Test
    public void shouldSolveForZeroInput() {
        int[] array = new int[]{7, 1, 3, 2, 4, 5, 6};
        assertThat(exercise.minimumSwaps(array)).isEqualTo(5);
    }

    @Test
    public void shouldSolveForFirstInput() {
        int[] array = new int[]{4, 3, 1, 2};
        assertThat(exercise.minimumSwaps(array)).isEqualTo(3);
    }

    @Test
    public void shouldSolveForSecondInput() {
        int[] array = new int[]{2, 3, 4, 1, 5};
        assertThat(exercise.minimumSwaps(array)).isEqualTo(3);
    }

}