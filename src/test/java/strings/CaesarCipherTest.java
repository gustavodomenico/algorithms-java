package strings;

import common.Exercise;
import common.InOutTest;
import org.junit.Test;

public class CaesarCipherTest extends InOutTest {
    private Exercise exercise = new CaesarCipher();

    private static final String INPUT_SAMPLE0 = "11\n" +
            "middle-Outz\n" +
            "2\n";

    private static final String OUTPUT_SAMPLE0 = "okffng-Qwvb\n";

    private static final String INPUT_SAMPLE1 = "10\n" +
            "Ciphering.\n" +
            "26\n";

    private static final String OUTPUT_SAMPLE1 = "Ciphering.\n";

    private static final String INPUT_SAMPLE2 = "90\n" +
            "!m-rB`-oN!.W`cLAcVbN/CqSoolII!SImji.!w/`Xu`uZa1TWPRq`uRBtok`xPT`lL-zPTc.BSRIhu..-!.!tcl!-U\n" +
            "62\n";

    private static final String OUTPUT_SAMPLE2 = "!w-bL`-yX!.G`mVKmFlX/MaCyyvSS!CSwts.!g/`He`eJk1DGZBa`eBLdyu`hZD`vV-jZDm.LCBSre..-!.!dmv!-E\n";

    @Test
    public void shouldSolveExerciseForFirstTestInput() {
        solve(INPUT_SAMPLE0, OUTPUT_SAMPLE0, exercise);
    }

    @Test
    public void shouldSolveExerciseForSecondTestInput() {
        solve(INPUT_SAMPLE1, OUTPUT_SAMPLE1, exercise);
    }

    @Test
    public void shouldSolveExerciseForThirdTestInput() {
        solve(INPUT_SAMPLE2, OUTPUT_SAMPLE2, exercise);
    }
}