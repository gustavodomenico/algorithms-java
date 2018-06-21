package week38;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class WhichSectionTest {
    private WhichSection exercise = new WhichSection();

    @Test
    public void shouldSolveExerciseForFirstInput() {
        assertThat(exercise.whichSection(470, 143, new int[] { 11, 24, 420, 6, 9} ), is(3));
    }
}