package week38;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MinuteToWinItTest {
    private MinuteToWinIt exercise = new MinuteToWinIt();

    @Test
    public void shouldSolveExerciseForFirstInput() {
        assertThat(exercise.minuteToWinIt(new int[] { 1, 2, 5, 7, 9, 85}, 2 ), is(2));
    }

    @Test
    public void shouldSolveExerciseForSecondInput() {
        assertThat(exercise.minuteToWinIt(new int[] { 4, 2, 0, -5, -6}, -2 ), is(2));
    }

    @Test
    public void shouldSolveExerciseForThirdInput() {
        assertThat(exercise.minuteToWinIt(new int[] { 0, 0, 0, 0, 0}, 0 ), is(0));
    }

    @Test
    public void shouldSolveExerciseForFourthInput() {
        assertThat(exercise.minuteToWinIt(new int[] { 1, 1, 1, 1, 1}, 0 ), is(0));
    }

    @Test
    public void shouldSolveExerciseForFifthInput() {
        assertThat(exercise.minuteToWinIt(new int[] { -4, -3, -1, 1, 3, 5, 7, 9}, 2 ), is(1));
    }

    @Test
    public void shouldSolveExerciseForSixthInput() {
        assertThat(exercise.minuteToWinIt(new int[] { 1, 3, -5, -6, 9, -9, 13}, 2 ), is(3));
    }

    @Test
    public void shouldSolveExerciseForSeventhInput() {
        assertThat(exercise.minuteToWinIt(new int[] { 0, 3, 6, 7, 8, 11}, 2 ), is(3));
    }

    @Test
    public void shouldSolveExerciseForEigthInput() {
        assertThat(exercise.minuteToWinIt(new int[] { -2 , 2000, 3000, 4000, 5000, 10}, 2 ), is(5));
    }

}