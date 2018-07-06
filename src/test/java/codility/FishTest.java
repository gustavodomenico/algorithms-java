package codility;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FishTest {
    private Fish exercise = new Fish();

    @Test
    public void shouldSolveForFirstInput() {
        assertThat(exercise.solution(new int[]{4, 3, 2, 1, 5}, new int[]{0, 1, 0, 0, 0})).isEqualTo(2);
    }
}