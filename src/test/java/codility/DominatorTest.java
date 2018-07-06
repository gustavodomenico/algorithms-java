package codility;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DominatorTest {
    private Dominator exercise = new Dominator();

    @Test
    public void shouldSolveForFirstInput() {
        assertThat(exercise.solution(new int[]{3, 4, 3, 2, 3, -1, 3, 3})).isEqualTo(7);
    }
}