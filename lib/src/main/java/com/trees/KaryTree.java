package com.trees;


import java.util.ArrayList;

public class KaryTree<A> {
    private KaryNode<A> root;

    public KaryTree() {
        root = null;
    }

    public KaryNode<A> getRoot() {
        return root;
    }

    public void setRoot(KaryNode<A> root) {
        this.root = root;
    }

    public KaryTree<String> fizzBuzzTree(KaryTree<Integer> inputTree) {
        KaryTree<String> outputTree = new KaryTree<>();
        if (inputTree.getRoot() == null) {
            return outputTree;
        }
        outputTree.setRoot(fizzBuzzTransform(inputTree.getRoot()));
        return outputTree;
    }

    private KaryNode<String> fizzBuzzTransform(KaryNode<Integer> inputNode) {
        String newValue = fizzBuzz(inputNode.getValue());
        KaryNode<String> outputNode = new KaryNode<>(newValue);

        for (KaryNode<Integer> child : inputNode.getChildren()) {
            outputNode.addChild(fizzBuzzTransform(child));
        }

        return outputNode;
    }

    private String fizzBuzz(Integer value) {
        if (value % 3 == 0 && value % 5 == 0) {
            return "FizzBuzz";
        } else if (value % 3 == 0) {
            return "Fizz";
        } else if (value % 5 == 0) {
            return "Buzz";
        } else {
            return value.toString();
        }
    }
}