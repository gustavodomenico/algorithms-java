package warmup;

import common.InOutTest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TimeConversionTest extends InOutTest {
    private TimeConversion exercise = new TimeConversion();

    private static final String INPUT = "07:05:45PM\n";

    private static final String OUTPUT = "19:05:45\n";

    @Test
    public void shouldSolveExerciseForTestInput() {
        input(INPUT);

        exercise.solve();

        assertThat(output()).isEqualTo(OUTPUT);
    }

    @Test
    public void shouldSolveExerciseForMidnight() {
        input("12:00:00AM\n");

        exercise.solve();

        assertThat(output()).isEqualTo("00:00:00\n");
    }

    @Test
    public void shouldSolveExerciseForHalfPastMidnight() {
        input("12:30:00AM\n");

        exercise.solve();

        assertThat(output()).isEqualTo("00:30:00\n");
    }

    @Test
    public void shouldSolveExerciseForNoon() {
        input("12:00:00PM\n");

        exercise.solve();

        assertThat(output()).isEqualTo("12:00:00\n");
    }

    @Test
    public void shouldSolveExerciseForHalfPastNoon() {
        input("12:30:00PM\n");

        exercise.solve();

        assertThat(output()).isEqualTo("12:30:00\n");
    }
}