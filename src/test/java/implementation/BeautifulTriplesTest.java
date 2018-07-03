package implementation;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BeautifulTriplesTest {
    private BeautifulTriples exercise = new BeautifulTriples();

    @Test
    public void shouldSolveForFirstInput() {
        assertThat(exercise.beautifulTriplets(3, new int[]{1, 2, 4, 5, 7, 8, 10})).isEqualTo(3);
    }

    @Test
    public void shouldSolveForSecondInput() {
        assertThat(exercise.beautifulTriplets(3, new int[]{1, 2})).isEqualTo(0);
    }

    @Test
    public void shouldSolveForThirdInput() {
        assertThat(exercise.beautifulTriplets(3, new int[]{1, 4, 7})).isEqualTo(1);
    }
}