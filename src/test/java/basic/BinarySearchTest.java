package basic;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BinarySearchTest {
    private BinarySearch exercise = new BinarySearch();

    @Test
    public void shouldSolveForFirstInput() {
        assertThat(exercise.binarySearch(new int[] {1, 2, 3, 4, 10, 90}, 10)).isEqualTo(4);
    }

    @Test
    public void shouldSolveForSecondInput() {
        assertThat(exercise.binarySearch(new int[] {1, 2, 3, 4, 10, 90}, 5)).isEqualTo(-1);
    }

    @Test
    public void shouldSolveForThirdInput() {
        assertThat(exercise.binarySearch(new int[] {1, 2, 3, 4, 10, 90}, 1)).isEqualTo(0);
    }
    @Test
    public void shouldSolveForFourthInput() {
        assertThat(exercise.binarySearch(new int[] {1, 2, 3, 4, 10, 90}, 90)).isEqualTo(5);
    }
}