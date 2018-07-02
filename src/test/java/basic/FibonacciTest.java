package basic;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FibonacciTest {
    private Fibonacci exercise = new Fibonacci();

    @Test
    public void shouldSolveFirstInput() {
        assertThat(exercise.fibonacci(17)).isEqualTo(1597);
    }

    @Test
    public void shouldSolveSecondInput() {
        assertThat(exercise.fibonacci(1)).isEqualTo(1);
    }
    @Test
    public void shouldSolveThirdInput() {
        assertThat(exercise.fibonacci(6)).isEqualTo(8);
    }
}