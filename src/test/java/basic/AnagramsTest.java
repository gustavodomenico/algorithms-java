package basic;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AnagramsTest {
    private Anagrams exercise = new Anagrams();

    @Test
    public void shouldSolveFirstInput() {
        assertThat(exercise.areAnagrams("gustavo", "gustavo")).isTrue();
    }

    @Test
    public void shouldSolveSecondInput() {
        assertThat(exercise.areAnagrams("stressed", "desserts")).isTrue();
    }

    @Test
    public void shouldSolveThirdInput() {
        assertThat(exercise.areAnagrams("gustavo", "avotuan")).isFalse();
    }

    @Test
    public void shouldSolveFourthInput() {
        assertThat(exercise.areAnagrams("gustavo", "")).isFalse();
    }

}