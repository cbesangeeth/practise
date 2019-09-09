package hackerearth.BinarySearchTree;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class BreadthFirstTraversalDemo {

    static Queue<Node> queue = new LinkedList<>();
    static Map<Integer, Integer> result = new HashMap<>();

    public static void main(String... A) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

//        int[] array = {15, 43, 5, 23, 4, 2, 9};

        int[] array = {2,1,3,4};
        for (int i = 0; i < array.length; i++) {
            binarySearchTree.build(array[i]);
        }

//        Arrays.stream(array).forEach(value -> binarySearchTree.build(value));

        System.out.println(binarySearchTree.root.key);
        printLevelWiseNodeElement(binarySearchTree.root, 1);

        result.forEach((k, v) -> {
            System.out.println("Key:" + k + ", Value:" + v);
        });

        Node searchNode = binarySearchTree.Search(binarySearchTree.root, 5);

        // print pre order
        System.out.println("Pre Order:");
        binarySearchTree.preOrder(searchNode);

        //print post order
        System.out.println("Post Order:");
        binarySearchTree.postOrder(binarySearchTree.root);
    }

    /**
     * Queue: Parse and put left and right child into the queue.
     * @param node
     * @param i
     */
    private static void printLevelWiseNodeElement(Node node, int i) {
        // add root node to the queue.
        queue.add(node);

        while (!queue.isEmpty()) {
            // get the HEAD out from the queue
            Node tempNode = queue.poll();

            result.put(tempNode.key, tempNode.level);

            // enqueue
            if (tempNode.left != null) {
                queue.add(tempNode.left);
                tempNode.left.level = tempNode.level + 1;
            }

            if (tempNode.right != null) {
                queue.add(tempNode.right);
                tempNode.right.level = tempNode.level + 1;
            }
        }
    }
}