package interview.kit.dicts;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TwoStringsTest {
    private TwoStrings exercise = new TwoStrings();

    @Test
    public void shouldSolveForFirstInput() {
        assertThat(exercise.twoStrings("hello", "world")).isEqualTo("YES");
    }

    @Test
    public void shouldSolveForSecondInput() {
        assertThat(exercise.twoStrings("hi", "world")).isEqualTo("NO");
    }
}