package GooglePreparation.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

class Bnode{
    int data;
    Bnode right;
    Bnode left;

    Bnode(int data){
        this.data = data;
        this.right = this.left = null;
    }
}

public class FindCousins {

    static Queue<Bnode> queue = new LinkedList<>();

    static void printBFS(Bnode root){

        // add root in queue
        queue.add(root);

        while(!queue.isEmpty()) {
            Bnode current = queue.poll();
            System.out.print(current.data + " ");

            if(current.left != null){
                queue.add(current.left);
            }
            if(current.right != null) {
                queue.add(current.right);
            }

        }
        System.out.println();
    }

    static Bnode mirror(Bnode node){

        if(node == null){
            return node;
        }

        Bnode right = mirror(node.right);
        Bnode left = mirror(node.left);

        node.right = left;
        node.left = right;

        return node;
    }

    public static void main(String[] args) {

        Bnode root = new Bnode(1);
        root.left = new Bnode(2);
        root.right = new Bnode(3);
        root.left.left = new Bnode(4);
        root.left.right = new Bnode(5);
        root.right.left = new Bnode(6);
        root.right.right = new Bnode(7);

        printBFS(root);

        // mirror
        mirror(root);
        printBFS(root);



    }
}
