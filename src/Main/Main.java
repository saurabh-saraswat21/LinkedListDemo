package Main;

import Student.Student;
import node.Node;

public class Main {
    public static void main(String[] args) {
        Student s1=new Student("Vijay",68);
        Node<Student> vijay = new Node<Student>(s1,null);
        System.out.println(vijay.getData());
        Student s2=new Student("Tanesh",63);
        Node<Student> Tanesh = new Node<Student>(s2,vijay);
        System.out.println(Tanesh.getData());
        System.out.println(Tanesh.getNext());
    }
}
