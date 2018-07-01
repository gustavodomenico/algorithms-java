package interview.kit.arrays;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TwoDimensionArrayTest {
    private TwoDimensionArray exercise = new TwoDimensionArray();

    @Test
    public void shouldSolveForFirstInput() {
        int[][] array = new int[][]{
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };

        assertThat(exercise.hourglassSum(array)).isEqualTo(19);
    }
}