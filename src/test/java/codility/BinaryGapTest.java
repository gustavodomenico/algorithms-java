package codility;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BinaryGapTest {
    private BinaryGap exercise = new BinaryGap();

    @Test
    public void shouldSolveForFirstInput() {
        assertThat(exercise.solution(9)).isEqualTo(2);
    }

    @Test
    public void shouldSolveForSecondInput() {
        assertThat(exercise.solution(529)).isEqualTo(4);
    }

    @Test
    public void shouldSolveForThirdInput() {
        assertThat(exercise.solution(10)).isEqualTo(1);
    }

    @Test
    public void shouldSolveForFourthInput() {
        assertThat(exercise.solution(32)).isEqualTo(0);
    }
}