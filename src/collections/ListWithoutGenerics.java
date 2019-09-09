package collections;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListWithoutGenerics {

    public static void main(String[] str) {

        // ArrayList
        List myList = new ArrayList();
        myList.add("hello");
        myList.add(1);
        myList.add(true);
        System.out.println("ArrayList :"+myList);

        // LinkedList
        List myLinkedList = new LinkedList();
        myLinkedList.add("hello");
        myLinkedList.add(1);
        myLinkedList.add(true);
        System.out.println("LinkedList :"+myLinkedList);

        // VectorList
        List myVectorList = new Vector();
        myVectorList.add("hello");
        myVectorList.add(1);
        myVectorList.add(true);
        System.out.println("VectorList :"+myVectorList);

        // StackList
        List myStackList = new Stack();
        myStackList.add("hello");
        myStackList.add(1);
        myStackList.add(true);
        System.out.println("StackList :"+myStackList);

    }
}
