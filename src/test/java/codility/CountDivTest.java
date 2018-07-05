package codility;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountDivTest {
    private CountDiv exercise = new CountDiv();

    @Test
    public void shouldSolveForFirstInput() {
        assertThat(exercise.solution(6, 11, 2)).isEqualTo(3);
    }

    @Test
    public void shouldSolveForSecondInput() {
        assertThat(exercise.solution(11, 345, 17)).isEqualTo(20);
    }
}