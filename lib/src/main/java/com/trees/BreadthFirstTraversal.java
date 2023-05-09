package com.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstTraversal {

    public static List<Integer> breadthFirst(BinaryTree tree) {
        List<Integer> result = new ArrayList<>();
        if (tree.root == null) {
            return result;
        }

        Queue<BinaryTree.Node> queue = new LinkedList<>();
        queue.add(tree.root);

        while (!queue.isEmpty()) {
            BinaryTree.Node currentNode = queue.poll();
            result.add(currentNode.value);

            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }

        return result;
    }
}