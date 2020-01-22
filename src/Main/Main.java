package Main;

import node.Node;

public class Main {
    public static void main(String[] args) {
    Node<Integer> node1 = new Node<Integer>(4,null);
        Node<Integer> node2 = new Node<Integer>(5,node1);
        Node<Integer> node3 = new Node<Integer>(6,node2);
        Node<Integer> node4 = new Node<Integer>(7,node3);
        System.out.println("N1"+node1);
        System.out.println("n2"+node2);
        System.out.println("n3"+node3);
        System.out.println("n4"+node4);
        System.out.println(node4.getNext().getNext().getNext().getData());
    }
}
