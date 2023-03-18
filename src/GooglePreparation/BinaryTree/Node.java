package GooglePreparation.BinaryTree;

import java.util.ArrayList;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    static int maxLevel = 0;

    static void leftView(Node root, int level, ArrayList<Integer> list) {

        if (root == null) {
            return;
        }

        if (maxLevel < level) { // 2<2
            list.add(root.data);

            System.out.println(root.data); // [1,3,
            maxLevel = level;
        }

        leftView(root.left, level + 1, list);
//        leftView(root.right, level+1, list);
    }

    static void rightView(Node root, int level, ArrayList<Integer> list) {

        if (root == null) {
            return;
        }

        if (maxLevel < level) { // 2<2
            list.add(root.data);
            System.out.println(root.data); // [1,3,
            maxLevel = level;
        }

        rightView(root.right, level + 1, list);
//        rightView(root.left, level+1, list);

    }
}
