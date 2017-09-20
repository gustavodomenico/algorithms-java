package sorting;

import common.Exercise;
import common.InOutTest;
import org.junit.Test;

public class IntroTutorialChallengesTest  extends InOutTest {

    private Exercise exercise = new IntroTutorialChallenges();

    private static final String INPUT0 = "4\n" +
            "6\n" +
            "1 4 5 7 9 12\n";

    private static final String OUTPUT0 = "1\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        solve(INPUT0, OUTPUT0, exercise);
    }
}