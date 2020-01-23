package Adt;

public interface ListADT<E> {
    boolean insert(int value);

    int search (int value);
    int delete(int value);
    void sort();
    void  print();
}
