package codility;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FrogJumpTest {
    private FrogJump exercise = new FrogJump();

    @Test
    public void shouldSolveForFirstInput() {
        assertThat(exercise.solution(10, 85, 30)).isEqualTo(3);
    }

}