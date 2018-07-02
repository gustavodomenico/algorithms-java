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

    @Test
    public void shouldSolveForSixthInput() {
        assertThat(exercise.kaprekarNumbers(1, 99999)).isEqualTo(asList(1, 9, 45, 55, 99, 297, 703, 999, 2223, 2728, 4950, 5050, 7272, 7777, 9999, 17344, 22222, 77778, 82656, 95121, 99999));
    }

}