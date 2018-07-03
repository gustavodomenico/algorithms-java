package strings;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AnagramsTest {
    private Anagrams exercise = new Anagrams();

    @Test
    public void shouldSolveFirstInput() {
        assertThat(exercise.anagram("aaabbb")).isEqualTo(3);
    }

    @Test
    public void shouldSolveSecondInput() {
        assertThat(exercise.anagram("ab")).isEqualTo(1);
    }

    @Test
    public void shouldSolveThirdInput() {
        assertThat(exercise.anagram("abc")).isEqualTo(-1);
    }

    @Test
    public void shouldSolveFourthInput() {
        assertThat(exercise.anagram("mnop")).isEqualTo(2);
    }

    @Test
    public void shouldSolveFifthInput() {
        assertThat(exercise.anagram("xyyx")).isEqualTo(0);
    }
    @Test
    public void shouldSolveSixthInput() {
        assertThat(exercise.anagram("xaxbbbxx")).isEqualTo(1);
    }

    @Test
    public void shouldSolveTempInput() {
        assertThat(exercise.anagram("csgokgibmftzeozyadcofpouaerckbbpwhdg")).isEqualTo(8);
    }
}