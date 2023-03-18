package GooglePreparation.LinkedList;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;

public class CreateLinkedList {
    public Node head = null;
    public Node tail = null;


    void addNode(int data){
        Node node = new Node(data);
        Node current = head;
        if(current == null){
            head = node;
            tail = node;
        } else {
            Node cur = current;
            while(cur.next != null){
                cur = cur.next;
            }
            cur.next = node;
            tail = node;
        }
    }

    void addAtFirst(int data){
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    void print(){

        Node current = head;
        if(current == null){
            System.out.println("list is empty");
            return;
        }

        while(current != null){
            System.out.print(current.data+"->");
            current = current.next;
        }
    }

    void addAtLast(int data){
        Node current = head;
        Node newLastNode = new Node(data);

        if(current == null){
            head = newLastNode;
            tail = newLastNode;
            return;
        }
        while(current.next != null){
            current = current.next;
        }
        current.next = newLastNode;

        tail = newLastNode;
    }

    boolean search(int data){

        Node current = head;

        if(current == null){
            return false;
        }

        while(current != null){
            if(current.data == data){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    void reverse(){

        Node current = head;
        Node previous = null;
        Node next = null;

        if( current == null){
            return;
        }
        // 1-> 2-> 3 => null
        tail = current;
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        head = previous;
    }

    void printLast(){
        System.out.println("Last:" +tail.data);
    }

    CreateLinkedList addBy1(CreateLinkedList ls){
        ls.reverse();

        Node current = head;
        Node tempNode = null;
        int add = 1;
        int reminder = 0;
        while(current != null){
            int temp = current.data + add;
            current.data = temp % 10;
            add = temp / 10;
            tempNode = current;

            current = current.next;
        }

        if(add >0){
            tempNode.next = new Node(add);
//            head.next = current;
        }

        ls.reverse();

        return ls;
    }

    public static void main(String arg[]){

        /*CreateLinkedList list = new CreateLinkedList();

        list.addAtLast(8);
        list.printLast();

        list.addNode(51);
        list.addNode(9);
        list.addNode(70);

        //   add at first --> O(1)
        list.addAtFirst(1);
        list.addAtFirst(7);

        // add at last --> o(1)
        list.addAtLast(18);
        list.printLast();

        list.addAtLast(81);
        list.printLast();

        list.addAtLast(80);
        list.printLast();

        // search --> O(n)
        System.out.println(list.search(7));
        list.print();
        list.printLast();

        list.reverse();
        System.out.println("Reverse:");
        list.print();
        list.printLast();*/

        CreateLinkedList newList = new CreateLinkedList();
        newList.addNode(1);
        newList.addNode(9);
        newList.addNode(9);
        newList.addNode(9);

        newList.print();
        CreateLinkedList created = newList.addBy1(newList);
        created.print();


    }
}
