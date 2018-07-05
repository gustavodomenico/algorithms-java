package codility;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RotateArrayTest {
    private RotateArray exercise = new RotateArray();

    @Test
    public void shouldSolveForFirstInput() {
        assertThat(exercise.solution(new int[] { 3, 8, 9, 7, 6}, 3)).isEqualTo(new int[] {9, 7, 6, 3, 8});
    }

    @Test
    public void shouldSolveForSecondInput() {
        assertThat(exercise.solution(new int[] { 1, 2, 3, 4}, 4)).isEqualTo(new int[] {1, 2, 3, 4});
    }


}