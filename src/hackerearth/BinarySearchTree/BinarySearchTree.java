package hackerearth.BinarySearchTree;


import javax.naming.directory.SearchControls;
import java.io.Serializable;

class Node {
    int key;
    int level;
    Node left, right;

    Node(int key, int level) {
        this.key = key;
        this.level = level;
        left = right = null;
    }
}

class BinarySearchTree {

    Node root;

    BinarySearchTree() {
        root = null;
    }

    void build(int key) {
        root = insertNode(root, key);
    }

    Node insertNode(Node root, int key) {

        if (root == null) {
            root = new Node(key, 1);
            return root;
        }

        if (key > root.key) {
            root.right = insertNode(root.right, key);
        } else if (key < root.key) {
            root.left = insertNode(root.left, key);
        }

        return root;
    }

    /**
     * Pre-Order.
     *
     * Root
     * Left
     * Right
     *
     * @param node
     */
    void preOrder(Node node) {
        if (node == null) {
            return;
        }

        System.out.println(node.key);

        preOrder(node.left);

        preOrder(node.right);

    }

    /**
     * Post-Order.
     *
     * Left
     * Right
     * Root
     *
     * @param node
     */
    void postOrder(Node node){
        if(node == null){
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.key);
    }


    /**
     * Search node.
     *
     * @param root
     * @param key
     * @return
     */
    Node Search(Node root, int key){

      if(root == null || root.key==key){
          return root;
      }

      Node node = null;

        if(key > root.key){
            node = Search(root.right, key);
        } else if(key< root.key){
            node = Search(root.left, key);
        }

        return node;

    }

}

