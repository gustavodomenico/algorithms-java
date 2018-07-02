package basic;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReverseStringTest {
    private ReverseString exercise = new ReverseString();

    @Test
    public void shouldSolveForFirstInput() {
        assertThat(exercise.reverse("gustavo")).isEqualTo("ovatsug");
    }

    @Test
    public void shouldSolveForSecondInput() {
        assertThat(exercise.reverse("g")).isEqualTo("g");
    }

    @Test
    public void shouldSolveForThirdInput() {
        assertThat(exercise.reverse("")).isEqualTo("");
    }

}