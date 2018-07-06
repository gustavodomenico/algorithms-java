package codility;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BracketsTest {
    private Brackets exercise = new Brackets();

    @Test
    public void shouldSolveForFirstInput() {
        assertThat(exercise.solution("{[()()]}")).isEqualTo(1);
    }

    @Test
    public void shouldSolveForSecondInput() {
        assertThat(exercise.solution("([)()]")).isEqualTo(0);
    }
}