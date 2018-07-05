package codility;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PassingCarsTest {
    private PassingCars exercise = new PassingCars();

    @Test
    public void shouldSolveForFirstInput() {
        assertThat(exercise.solution(new int[]{0, 1, 0, 1, 1})).isEqualTo(5);
    }
}