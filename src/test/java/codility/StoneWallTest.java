package codility;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StoneWallTest {
    private StoneWall exercise = new StoneWall();

    @Test
    public void shouldSolveForFirstInput() {
        assertThat(exercise.solution(new int[]{8, 8, 5, 7, 9, 8, 7, 4, 8})).isEqualTo(7);
    }
}