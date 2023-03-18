package GooglePreparation.LinkedList;

public class ReverseListUsingRecursion {

    public static void main(String[] args) {
        CreateLinkedList newList = new CreateLinkedList();
        newList.addNode(1);
        newList.addNode(9);
        newList.addNode(9);
        newList.addNode(9);

        newList.print();

        System.out.println("Reverse:");
        Node reversedNode = printReverseList(newList.head, null);
        while(reversedNode !=null){
            System.out.println(reversedNode.data);
            reversedNode = reversedNode.next;
        }
    }

    static Node printReverseList(Node root, Node prev){
        if(root == null || root.next == null){
            return root;
        }

        Node node= printReverseList(root.next, prev);
        System.out.println(root.data);

        root.next.next = root;
        root.next = null;

//        root.next = node;
        return node;
    }

}
