package GooglePreparation.BinaryTree;

public class MinMaxInBST {

//    The smallest element of a binary search tree is the leftmost element of the tree
//    and the largest element is the rightmost one.

    static int min = 0;
    static int max = Integer.MAX_VALUE;

    public static void main(String[] args) {
        int arr[] = {6, 3, 0, 5, 1, 7, 4};
        Node root = BinarySearchTree.frameBinarySearchTree(arr);

        findMinMax(root);
        System.out.println(min);
        System.out.println(max);
    }

    static void findMinMax(Node root) {

        Node current = root;

        while (current !=null){
            min = current.data;
            current = current.left;
        }

        while(root != null){
            max = root.data;
            root = root.right;
        }
    }
}

