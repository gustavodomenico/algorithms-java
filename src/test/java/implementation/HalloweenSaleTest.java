package implementation;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HalloweenSaleTest {
    private HalloweenSale exercise = new HalloweenSale();

    @Test
    public void shouldSolveForFirstInput() {
        assertThat(exercise.howManyGames(20, 3, 6, 80)).isEqualTo(6);
    }
}