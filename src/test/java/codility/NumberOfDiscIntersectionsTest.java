package codility;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberOfDiscIntersectionsTest {
    private NumberOfDiscIntersections exercise = new NumberOfDiscIntersections();

    @Test
    public void shouldSolveForFirstInput() {
        assertThat(exercise.solution(new int[]{1, 5, 2, 1, 4, 0})).isEqualTo(11);
    }
}