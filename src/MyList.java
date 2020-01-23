import Adt.ListADT;

public class MyList<E> implements ListADT<E> {
    private Node <E> head = null;
    private int size =0;
    public void addFirst(E item)
    {
        head =new Node<E>(item,head);
        size++;
    }

    private static class Node<E>{
        private E data;
        private Node<E> next;

        private Node(E data ,Node<E> next)
        {
            this.data= data;
            this.next=next;

        }
        private Node (E data)
        {
            this.data=data;
            //This Happens By default
            //this.next=null;
        }

        private E getData() {
            return data;
        }

        private Node<E> getNext() {
            return next;
        }
    }



    int [] array;
    //public MyList()
    @Override
    public boolean insert(int value) {
        return false;
    }

    @Override
    public int search(int value) {
        return 0;
    }

    @Override
    public int delete(int value) {
        return 0;
    }

    @Override
    public void sort() {

    }

    @Override
    public void print() {

    }
    public void add(int index,E item)
    {

    }

}
