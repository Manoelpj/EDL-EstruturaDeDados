package VetLisSeq.lista.listaImplementacao;

public interface Lista{


    public Object first();
    public Object last();
    public Object before(Node no);
    public Object after(Node no);

    public void replaceElements(Node no, Object objeto);
    public void swapElements(Node no1, Node no2);
    public void insertBefore(Node no, Object objeto);    
    public void insertAfter(Node no, Object objeto);
    public void insertFirst(Object objeto);
    public void insertLast(Object objeto);
    public void remove(Node no);

    public boolean isFirst(Object objeto);    
    public boolean isLast(Object objeto);

    public int size();
    public boolean isEmpty();

}