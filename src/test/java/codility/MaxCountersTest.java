package codility;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxCountersTest {
    private MaxCounters exercise = new MaxCounters();

    @Test
    public void shouldSolveForFirstInput() {
        assertThat(exercise.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4})).isEqualTo(new int[] {3, 2, 2, 4, 2});
    }
}