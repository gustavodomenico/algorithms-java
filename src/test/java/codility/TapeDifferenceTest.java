package codility;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TapeDifferenceTest {
    private TapeDifference exercise = new TapeDifference();

    @Test
    public void shouldSolveForFirstInput() {
        assertThat(exercise.solution(new int[] { 3, 1, 2, 4, 3 } )).isEqualTo(1);
    }

    @Test
    public void shouldSolveForSecondInput() {
        assertThat(exercise.solution(new int[] { 3, 1 } )).isEqualTo(2);
    }

    @Test
    public void shouldSolveForThirdInput() {
        assertThat(exercise.solution(new int[] { -1000, 1000 } )).isEqualTo(2000);
    }
}