package com.trees;
import java.util.List;

public class BinaryTree {
    public Node root;

    public BinaryTree() {
        root = null;
    }

    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    public void preOrder(Node node, List<Integer> result) {
        if (node == null) {
            return;
        }

        result.add(node.value);
        preOrder(node.left, result);
        preOrder(node.right, result);
    }

    public void inOrder(Node node, List<Integer> result) {
        if (node == null) {
            return;
        }

        inOrder(node.left, result);
        result.add(node.value);
        inOrder(node.right, result);
    }

    public void postOrder(Node node, List<Integer> result) {
        if (node == null) {
            return;
        }

        postOrder(node.left, result);
        postOrder(node.right, result);
        result.add(node.value);
    }

    // lab16 new methods
    public int findMaxValue() {
        return findMaxValueRecursive(root);
    }

    private int findMaxValueRecursive(Node node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }

        int maxLeft = findMaxValueRecursive(node.left);
        int maxRight = findMaxValueRecursive(node.right);

        return Math.max(node.value, Math.max(maxLeft, maxRight));
    }
}
