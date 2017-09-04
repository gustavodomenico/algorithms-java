package implementation;

import common.InOutTest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DesignerPDFViewerTest extends InOutTest {
    private DesignerPDFViewer exercise = new DesignerPDFViewer();

    private static final String INPUT_SAMPLE0 = "1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5\n" +
            "abc\n";

    private static final String OUTPUT_SAMPLE0 = "9\n";

    private static final String INPUT_SAMPLE1 = "1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 7\n" +
            "zaba\n";

    private static final String OUTPUT_SAMPLE1 = "28\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        input(INPUT_SAMPLE0);

        exercise.solve();

        assertThat(output()).isEqualTo(OUTPUT_SAMPLE0);
    }

    @Test
    public void shouldSolveExerciseForSecondTestInput() {
        input(INPUT_SAMPLE1);

        exercise.solve();

        assertThat(output()).isEqualTo(OUTPUT_SAMPLE1);
    }

}