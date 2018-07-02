package implementation;

import org.junit.Test;

import static com.google.common.primitives.Ints.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class KaprekarNumbersTest {
    private KaprekarNumbers exercise = new KaprekarNumbers();

    @Test
    public void shouldSolveForFirstInput() {
        assertThat(exercise.kaprekarNumbers(1, 100)).isEqualTo(asList(1, 9, 45, 55, 99));
    }
}