public interface Lista{


    public Object first();
    public Object last();
    public Object before(Object objeto);
    public Object after(Object objeto);

    public replaceElements(Node no, Object objeto);
    public swapElements(Node no, Object objeto);
    public void insertBefore(Node no, Object objeto);    
    public void insertAfter(Node no, Object objeto);
    public Object remove(Node no);

    public boolean isFirst(Object objeto);    
    public boolean isLast(Object objeto);

    public int size();
    public boolean isEmpty();

}