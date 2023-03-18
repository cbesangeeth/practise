package GooglePreparation.BinaryTree;

public class Search {

    static boolean result = false;

    public static void main(String[] args) {

        int arr[] = {5,3,6,2,8,9,0};
        Node root = BinarySearchTree.frameBinarySearchTree(arr);

        int searchValue = 2;

        // recursive
        boolean r = search(root, searchValue);
        System.out.println(r);

        // simple while loop
        boolean r2 =  searchBinaryTree(root, searchValue);
        System.out.println(r2);

    }

    static boolean searchBinaryTree(Node root, int value){

        while(root != null){
            if(root.data == value){
                return true;
            }else if(root.data < value){
                root = root.right;
            }else if(root.data > value){
                root = root.left;
            }

        }
        return false;
    }

    static boolean search(Node root, int value){

        if(root == null){
            return false;
        }

        if(root.data == value){
            result = result || true;
            return true;
        }

        search(root.left, value);
        search(root.right, value);

        return result || false;
    }

}


