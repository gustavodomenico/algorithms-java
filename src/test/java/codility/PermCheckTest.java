package codility;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PermCheckTest {
    private PermCheck exercise = new PermCheck();

    @Test
    public void shouldSolveForFirstInput() {
        assertThat(exercise.solution(new int[] { 4, 1, 3, 2 } )).isEqualTo(1);
    }

    @Test
    public void shouldSolveForSecondInput() {
        assertThat(exercise.solution(new int[] { 4, 1, 3, 5 } )).isEqualTo(0);
    }

    @Test
    public void shouldSolveForThirdInput() {
        assertThat(exercise.solution(new int[] { 4, 1, 3 } )).isEqualTo(0);
    }
}