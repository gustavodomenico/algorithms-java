package basic;

import basic.structs.TreeNode;
import org.junit.Test;

import static com.google.common.primitives.Ints.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class TreeWalkingTest {
    private TreeWalking exercise = new TreeWalking();

    @Test
    public void shouldSolveForFirstInput() {
        TreeNode root =
                new TreeNode(4,
                        new TreeNode(2,
                                new TreeNode(1),
                                new TreeNode(3)),
                        new TreeNode(6,
                                new TreeNode(5),
                                new TreeNode(7)));

        assertThat(exercise.inOrder(root)).isEqualTo(asList(1, 2, 3, 4, 5, 6, 7));
    }

}