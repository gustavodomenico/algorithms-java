package codility;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxSliceSumTest {
    private MaxSliceSum exercise = new MaxSliceSum();

    @Test
    public void shouldSolveForFirstInput() {
        assertThat(exercise.solution(new int[]{3, 2, -6, 4, 0})).isEqualTo(5);
    }

}