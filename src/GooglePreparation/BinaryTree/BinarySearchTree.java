package GooglePreparation.BinaryTree;

import java.util.ArrayList;

public class BinarySearchTree {

    static Node root;

    public static void main(String[] args) {

        int[] array = {4, 2, 6, 3, 1, 9};

        Node bst = frameBinarySearchTree(array);

        BinaryTreePrintRightView view = new BinaryTreePrintRightView();

        ArrayList<Integer> list = new ArrayList<>();
        Node.leftView(bst.left, 1, list);
        Node.maxLevel = 0;
        Node.rightView(bst, 1, list);
        System.out.println(list);
    }

    static Node frameBinarySearchTree(int[] arr) {

        if (arr == null) {
            return null;
        }

        root = new Node(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            frame(root, arr[i]);
        }


        return root;
    }

    static Node frame(Node current, int data) {

        if (current == null) {
            return new Node(data);
        }

        if (data > current.data) {
            current.right = frame(current.right, data);

        } else if (data < current.data) {
            current.left = frame(current.left, data);
        }
//        else {
//            return current;
//        }


        return current;
    }

    public static Node insert(Node root,int data) {
        Node current = root;
        Node newNode = new Node(data);
        Node prev = null;

        while(current != null){
            prev = current;
            if(data < current.data){
                current = current.left;
            } else{
                current = current.right;
            }
        }

        if(prev == null){
            return newNode;
        }

        if(data < prev.data){
            prev.left = newNode;
        } else {
            prev.right = newNode;
        }

        return root;
    }
}
