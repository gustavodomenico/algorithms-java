package codility;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxProductOfThreeTest {
    private MaxProductOfThree exercise = new MaxProductOfThree();

    @Test
    public void shouldSolveForFirstInput() {
        assertThat(exercise.solution(new int[]{-3, 1, 2, -2, 5, 6})).isEqualTo(60);
    }
}