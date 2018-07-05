package codility;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TrianglesBuildTest {
    private TrianglesBuild exercise = new TrianglesBuild();

    @Test
    public void shouldSolveForFirstInput() {
        assertThat(exercise.solution(new int[]{10, 2, 5, 1, 8, 20})).isEqualTo(1);
    }

    @Test
    public void shouldSolveForSecondInput() {
        assertThat(exercise.solution(new int[]{10, 50, 5, 1})).isEqualTo(0);
    }

    @Test
    public void shouldSolveForThirdInput() {
        assertThat(exercise.solution(new int[]{10})).isEqualTo(0);
    }

    @Test
    public void shouldSolveForFourthInput() {
        assertThat(exercise.solution(new int[]{10, 12})).isEqualTo(0);
    }

    @Test
    public void shouldSolveForFifthInput() {
        assertThat(exercise.solution(new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE - 1, Integer.MAX_VALUE - 2})).isEqualTo(1);
    }

}