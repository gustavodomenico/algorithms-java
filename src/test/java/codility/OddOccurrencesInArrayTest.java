package codility;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OddOccurrencesInArrayTest {
    private OddOccurrencesInArray exercise = new OddOccurrencesInArray();

    @Test
    public void shouldSolveForFirstInput() {
        assertThat(exercise.solution(new int[] {9, 3, 9, 3, 9, 7, 9})).isEqualTo(7);
    }
}