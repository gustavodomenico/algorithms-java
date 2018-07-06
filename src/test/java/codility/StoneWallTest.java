package codility;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StoneWallTest {
    private Fish exercise = new Fish();

    @Test
    public void shouldSolveForFirstInput() {
        assertThat(exercise.solution(new int[]{4, 3, 2, 1, 5}, new int[]{0, 1, 0, 0, 0})).isEqualTo(2);
    }

    8    H[1] = 8    H[2] = 5
    H[3] = 7    H[4] = 9    H[5] = 8
    H[6] = 7    H[7] = 4    H[8] = 8
}