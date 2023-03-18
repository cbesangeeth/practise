package GooglePreparation.BinaryTree;

import java.util.ArrayList;
import java.util.Collections;

public class BinaryTreePrintRightView {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ArrayList<Integer> list = new ArrayList<>();
        Node.leftView(root.left, 1, list);
        System.out.println(list);

        Collections.reverse(list);

        Node.maxLevel=0;
        Node.rightView(root, 1, list);

        System.out.println(list);

    }



}
