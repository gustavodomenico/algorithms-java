package booking;

import common.Exercise;
import common.InOutTest;
import org.junit.Test;

public class HotelReviewTest extends InOutTest {
    private Exercise exercise = new HotelReview();

    private static final String INPUT0 = "breakfast beach citycenter location metro view staff price\n" +
            "5\n" +
            "1\n" +
            "2\n" +
            "1\n" +
            "1\n" +
            "2\n" +
            "2\n" +
            "5\n" +
            "This hotel has a nice view of the citycenter. The location is perfect.\n" +
            "The breakfast is ok. Regarding location, it is quite far from citycenter but price is cheap so it is worth.\n" +
            "Location is excellent, 5 minutes from the citycenter. There is also a metro station very close to the hotel.\n" +
            "They said I couldn't take my dog and there were other guests with dogs! That is not fair.\n" +
            "Very friendly staff and good cost-benefit ratio. Its location is a bit far from citycenter.\n";

    private static final String OUTPUT0 = "2\n" +
            "1\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        solve(INPUT0, OUTPUT0, exercise);
    }
}