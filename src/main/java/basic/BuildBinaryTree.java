package basic;

import basic.structs.TreeNode;

class BuildBinaryTree {
    TreeNode build(int[] array) {
        return internal(array, 0, array.length - 1);
    }

    private TreeNode internal(int[] array, int from, int to) {
        if (from > to) {
            return null;
        }

        int mid = (from + to) / 2;

        TreeNode node = new TreeNode(array[mid]);
        node.left = internal(array, from, mid - 1);
        node.right = internal(array, mid + 1, to);

        return node;
    }
}
