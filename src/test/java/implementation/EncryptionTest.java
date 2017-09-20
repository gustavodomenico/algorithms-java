package implementation;

import common.Exercise;
import common.InOutTest;

import org.junit.Test;

public class EncryptionTest extends InOutTest {

    private Exercise exercise = new Encryption();

    private static final String INPUT0 = "haveaniceday\n";

    private static final String OUTPUT0 = "hae and via ecy\n";

    private static final String INPUT1 = "feedthedog";

    private static final String OUTPUT1 = "fto ehg ee dd\n";

    private static final String INPUT2 = "chillout";

    private static final String OUTPUT2 = "clu hlt io\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        solve(INPUT0, OUTPUT0, exercise);
    }

    @Test
    public void shouldSolveExerciseForSecondTestInput() {
        solve(INPUT1, OUTPUT1, exercise);
    }

    @Test
    public void shouldSolveExerciseForThirdTestInput() {
        solve(INPUT2, OUTPUT2, exercise);
    }
}