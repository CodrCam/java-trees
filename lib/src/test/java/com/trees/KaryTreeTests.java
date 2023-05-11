package com.trees;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KaryTreeTests {

    @Test
    void testFizzBuzzTree() {
        KaryTree<Integer> inputTree = new KaryTree<>();
        KaryNode<Integer> root = new KaryNode<>(15);
        KaryNode<Integer> child1 = new KaryNode<>(3);
        KaryNode<Integer> child2 = new KaryNode<>(5);
        KaryNode<Integer> child3 = new KaryNode<>(2);
        KaryNode<Integer> child4 = new KaryNode<>(30);

        root.addChild(child1);
        root.addChild(child2);
        child1.addChild(child3);
        child1.addChild(child4);

        inputTree.setRoot(root);

        KaryTree<String> expectedTree = new KaryTree<>();
        KaryNode<String> expectedRoot = new KaryNode<>("FizzBuzz");
        KaryNode<String> expectedChild1 = new KaryNode<>("Fizz");
        KaryNode<String> expectedChild2 = new KaryNode<>("Buzz");
        KaryNode<String> expectedChild3 = new KaryNode<>("2");
        KaryNode<String> expectedChild4 = new KaryNode<>("FizzBuzz");

        expectedRoot.addChild(expectedChild1);
        expectedRoot.addChild(expectedChild2);
        expectedChild1.addChild(expectedChild3);
        expectedChild1.addChild(expectedChild4);

        expectedTree.setRoot(expectedRoot);

        KaryTree<String> outputTree = new KaryTree<>();
        outputTree = outputTree.fizzBuzzTree(inputTree);

        assertEquals(expectedTree.getRoot().getValue(), outputTree.getRoot().getValue());
        assertEquals(expectedTree.getRoot().getChildren().size(), outputTree.getRoot().getChildren().size());

        for (int i = 0; i < outputTree.getRoot().getChildren().size(); i++) {
            assertEquals(expectedTree.getRoot().getChildren().get(i).getValue(), outputTree.getRoot().getChildren().get(i).getValue());
        }

        assertEquals(expectedTree.getRoot().getChildren().get(0).getChildren().size(), outputTree.getRoot().getChildren().get(0).getChildren().size());

        for (int i = 0; i < outputTree.getRoot().getChildren().get(0).getChildren().size(); i++) {
            assertEquals(expectedTree.getRoot().getChildren().get(0).getChildren().get(i).getValue(), outputTree.getRoot().getChildren().get(0).getChildren().get(i).getValue());
        }
    }
}