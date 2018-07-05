package codility;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PermElementTest {
    private PermElement exercise = new PermElement();

    @Test
    public void shouldSolveForFirstInput() {
        assertThat(exercise.solution(new int[] { 2, 3, 1, 5 } )).isEqualTo(4);
    }
}