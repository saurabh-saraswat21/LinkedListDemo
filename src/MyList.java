import Adt.ListADT;

public class MyList<E> implements ListADT<E> {

    private static class Node<E>{
        private E data;
        private Node<E> next;




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
}
