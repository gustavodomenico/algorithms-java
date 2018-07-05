package codility;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GenomicRangeQueryTest {
    private GenomicRangeQuery exercise = new GenomicRangeQuery();

    @Test
    public void shouldSolveForFirstInput() {
        assertThat(exercise.solution("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6})).isEqualTo(new int[] {2, 4, 1});
    }
}