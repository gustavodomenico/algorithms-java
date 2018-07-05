package codility;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinAvgTwoSliceTest {
    private MinAvgTwoSlice exercise = new MinAvgTwoSlice();

    @Test
    public void shouldSolveForFirstInput() {
        assertThat(exercise.solution(new int[]{4, 2, 2, 5, 1, 5, 8})).isEqualTo(1);
    }
}