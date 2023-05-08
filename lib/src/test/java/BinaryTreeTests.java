import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.trees.BinarySearchTree;
import com.trees.BinaryTree;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreeTests {

    @Test
    public void testInstantiateEmptyTree() {
        BinaryTree tree = new BinaryTree();
        assertNull(tree.root);
    }

    @Test
    public void testInstantiateSingleRootNode() {
        BinaryTree tree = new BinaryTree();
        tree.root = new BinaryTree.Node(1);
        assertNotNull(tree.root);
        assertEquals(1, tree.root.value);
    }

    @Test
    public void testAddLeftAndRightChildToNode() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(10);
        tree.add(5);
        tree.add(15);
        assertNotNull(tree.root.left);
        assertNotNull(tree.root.right);
        assertEquals(5, tree.root.left.value);
        assertEquals(15, tree.root.right.value);
    }

    @Test
    public void testPreOrderTraversal() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(10);
        tree.add(5);
        tree.add(15);
        tree.add(3);
        tree.add(7);
        tree.add(12);
        tree.add(17);

        List<Integer> result = new ArrayList<>();
        tree.preOrder(tree.root, result);

        assertEquals(List.of(10, 5, 3, 7, 15, 12, 17), result);
    }

    @Test
    public void testInOrderTraversal() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(10);
        tree.add(5);
        tree.add(15);
        tree.add(3);
        tree.add(7);
        tree.add(12);
        tree.add(17);

        List<Integer> result = new ArrayList<>();
        tree.inOrder(tree.root, result);

        assertEquals(List.of(3, 5, 7, 10, 12, 15, 17), result);
    }

    @Test
    public void testPostOrderTraversal() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(10);
        tree.add(5);
        tree.add(15);
        tree.add(3);
        tree.add(7);
        tree.add(12);
        tree.add(17);

        List<Integer> result = new ArrayList<>();
        tree.postOrder(tree.root, result);

        assertEquals(List.of(3, 7, 5, 12, 17, 15, 10), result);
    }

    @Test
    public void testContainsMethod() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(10);
        tree.add(5);
        tree.add(15);
        tree.add(3);
        tree.add(7);
        tree.add(12);
        tree.add(17);

        assertTrue(tree.contains(10));
        assertTrue(tree.contains(5));
        assertTrue(tree.contains(15));
        assertTrue(tree.contains(3));
        assertTrue(tree.contains(7));
        assertTrue(tree.contains(12));
        assertTrue(tree.contains(17));

        assertFalse(tree.contains(0));
        assertFalse(tree.contains(20));
        assertFalse(tree.contains(6));
        assertFalse(tree.contains(11));
    }

    // Test for max in a binary tree
    @Test
    public void testFindMaxValue() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(25);
        tree.add(20);
        tree.add(30);
        tree.add(22);
        tree.add(28);
        tree.add(26);
        tree.add(27);

        int maxValue = tree.findMaxValue();
        assertEquals(30, maxValue);
    }
}