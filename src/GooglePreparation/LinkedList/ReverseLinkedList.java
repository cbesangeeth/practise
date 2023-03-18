package GooglePreparation.LinkedList;

import java.util.Scanner;

public class ReverseLinkedList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int[] arg = {2,4,2,5};

        Node root = new Node(arg[0]);
        Node head = root;
        for(int i =1 ; i<n ; i++){
            root.next= new Node(arg[i]);
            root = root.next;
        }

        while(head !=null){
            System.out.println(head.data);
            head = head.next;
        }
    }
}
