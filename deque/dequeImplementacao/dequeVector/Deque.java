package deque.dequeImplementacao.dequeVector;

public interface Deque{
    public void addFirst(Object objeto);

    public void addLast(Object objeto);

    public Object removeFirst();

    public Object removeLast();

    public Object first();

    public Object last();

    public int size();

    public boolean isEmpty();
}