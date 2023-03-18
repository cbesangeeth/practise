package GooglePreparation.BinaryTree;

public class BinarySearchTreeTraversal {

    static void printInorder(Node root) {

        Node current = root;

        if (current == null) {
            return;
        }
        printInorder(current.left);
        System.out.print(current.data);
        printInorder(current.right);
    }

    static void printPreOrder(Node root) {

        Node current = root;

        if (current == null) {
            return;
        }
        System.out.print(current.data);
        printPreOrder(current.left);
        printPreOrder(current.right);
    }

    static void printPostOrder(Node root){
        if(root == null){
            return;
        }

        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.data);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("In order:");
        printInorder(root);

        System.out.println("Pre order:");
        printPreOrder(root);

        System.out.println("Post order:");
        printPostOrder(root);



    }
}
