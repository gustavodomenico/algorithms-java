package interview.kit.sorting;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MarkAndToysTest {
    private MarkAndToys markAndToys = new MarkAndToys();

    @Test
    public void shouldSolveForFirstInput() {
        assertThat(markAndToys.maximumToys(new int[]{1, 12, 5, 111, 200, 1000, 10}, 50)).isEqualTo(4);
    }

}