# Binary Trees, Binary Search Trees, and K-ary Trees Implementation

The Binary Trees, Binary Search Trees, and K-ary Trees Implementation is a Java program that demonstrates the usage and functionality of Binary Trees, Binary Search Trees, and K-ary Trees. The application contains several classes, including `Node`, `BinaryTree`, `BinarySearchTree`, `BreadthFirstTraversal`, `KaryNode`, and `KaryTree`, which implement the respective data structures and their associated operations.

## Application Overview

The application consists of the following main components:

1. `Node` class: Represents a node object with value, left child, and right child properties for use in the Binary Trees and Binary Search Trees.
2. `BinaryTree` class: Implements a Binary Tree data structure with methods for depth-first traversals, including pre-order, in-order, and post-order traversals, and breadth-first traversal.
3. `BinarySearchTree` class: Implements a Binary Search Tree data structure, which is a subclass of the BinaryTree class, with additional methods for adding new nodes and checking if a value is present in the tree.
4. `BreadthFirstTraversal` class: Implements a breadth-first traversal for a Binary Tree, returning a list of all values in the tree in the order they were encountered.
5. `KaryNode` class: Represents a node object with value and children properties for use in K-ary Trees.
6. `KaryTree` class: Implements a K-ary Tree data structure with a method for applying the FizzBuzz transformation to the tree.
7. `BinaryTreeTests` and `KaryTreeTests` classes: Contain JUnit Jupiter tests for validating the functionality of the BinaryTree, BinarySearchTree, BreadthFirstTraversal, and KaryTree classes.

## Getting Started

These instructions will help you get the project up and running on your local machine for development and testing purposes.

### Prerequisites

Make sure you have the following software installed:

- Java JDK 8 or later
- Gradle

### Installing

1. Clone the repository:

    ```
    git clone https://github.com/CodrCam/java-trees.git
    cd java-trees
    ```

2. Build the project:

   `$ gradle build`

## Running the Tests

To run the tests for the application, use the following command:

`$ gradle test`

The tests will validate the functionality of the BinaryTree, BinarySearchTree, BreadthFirstTraversal, and KaryTree classes, ensuring proper operation of depth-first traversal methods, breadth-first traversal, adding new nodes, checking for the presence of a value in the tree, and applying the FizzBuzz transformation.

## Whiteboard Images

### Binary Search Tree

![BinarySearchTree](./lib/src/main/resources/code16WB_1.jpg)

![BinarySearchTree2](./lib/src/main/resources/code16WB_2.jpg)

These images demonstrate the structure of a sample Binary Search Tree with the following values: 10, 5, 15, 3, 7, 12, and 17.

### Depth-First Traversals and Breadth-First Traversal

![DepthFirstTraversalsAndBreadthFirstTraversal](./lib/src/main/resources/code-17_1.jpg)

This image visualizes the order of nodes visited during Pre-order, In-order, and Post-order depth-first traversals, as well as Breadth-first traversal for the sample Binary Search Tree.

### FizzBuzz K-ary Tree Transformation

![FizzBuzzKaryTree](./lib/src/main/resources/code18_1.jpg)

This image demonstrates the process of applying the FizzBuzz transformation to a sample K-ary Tree.

## Time Spent on coding problem

- .25 hours
- .7 hours on the build
- .95 hours total

## Built With

- [Java](https://www.oracle.com/java/) - The programming language used
- [Gradle](https://gradle.org/) - Build tool and dependency management
- [JUnit 5](https://junit.org/junit5/) - Testing framework for Java applications

## Authors

- Cameron Griffin - [CodrCam](https://github.com/CodrCam)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE) file for details.