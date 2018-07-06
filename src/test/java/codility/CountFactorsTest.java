package codility;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountFactorsTest {
    private CountFactors exercise = new CountFactors();

    @Test
    public void shouldSolveForFirstInput() {
        assertThat(exercise.solution(24)).isEqualTo(8);
    }

}