package basic;


import basic.structs.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeWalking {

    public List<Integer> inOrder(TreeNode root) {
        List<Integer> array = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();

        // Add all leftmost nodes
        TreeNode p = root;

        while (!stack.empty() || p != null) {
            // if it is not null, push to stack
            //and go down the tree to left
            if (p != null) {
                stack.push(p);
                p = p.left;

                // if no left child
                // pop stack, process the node
                // then let p point to the right
            } else {
                TreeNode t = stack.pop();
                array.add(t.data);
                p = t.right;
            }
        }

        return array;
    }

    public List<Integer> inOrderRecursive(TreeNode root) {
        List<Integer> array = new ArrayList<>();
        internalInOrder(root, array);
        return array;
    }

    private void internalInOrder(TreeNode node, List<Integer> array) {
        if (node != null) {
            internalInOrder(node.left, array);
            array.add(node.data);
            internalInOrder(node.right, array);
        }
    }
}
