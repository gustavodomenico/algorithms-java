package codility;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FrogRiverTest {
    private FrogRiver exercise = new FrogRiver();

    @Test
    public void shouldSolveForFirstInput() {
        assertThat(exercise.solution(5, new int[] { 1, 3, 1, 4, 2, 3, 5, 4  } )).isEqualTo(6);
    }
}