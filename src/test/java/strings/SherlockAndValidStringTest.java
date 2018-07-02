package strings;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SherlockAndValidStringTest {
    private SherlockAndValidString exercise = new SherlockAndValidString();

    @Test
    public void shouldSolveFourthCase() {
        assertThat(exercise.isValid("aabbc")).isEqualTo("YES");
    }

    @Test
    public void shouldSolveExampleCase() {
        assertThat(exercise.isValid("abcc")).isEqualTo("YES");
    }

    @Test
    public void shouldSolveFirstCase() {
        assertThat(exercise.isValid("aabbcd")).isEqualTo("NO");
    }

    @Test
    public void shouldSolveSecondCase() {
        assertThat(exercise.isValid("aabbccddeefghi")).isEqualTo("NO");
    }

    @Test
    public void shouldSolveThirdCase() {
        assertThat(exercise.isValid("aaaabbcc")).isEqualTo("NO");
    }

}