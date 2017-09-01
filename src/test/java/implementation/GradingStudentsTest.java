package implementation;

import common.AbstractInOutTest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GradingStudentsTest extends AbstractInOutTest {
    private GradingStudents exercise = new GradingStudents();

    private static final String INPUT = "4\n" +
            "73\n" +
            "67\n" +
            "38\n" +
            "33\n";

    private static final String OUTPUT = "75\n" +
            "67\n" +
            "40\n" +
            "33\n";

    @Test
    public void shouldSolveExerciseForTestInput() {
        input(INPUT);

        exercise.solve();

        assertThat(output()).isEqualTo(OUTPUT);
    }

}