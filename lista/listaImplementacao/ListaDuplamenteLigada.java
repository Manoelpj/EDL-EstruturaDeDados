public class ListaDuplamenteLigada implements Lista{
    public Node no;
    public Node head, tail;

    public ListaDuplamenteLigada(){
        this.head = this.tail = null;
    }


    public Object first(){

    }

    public Object last(){

    }

    public Object before(Object objeto){

    }

    public Object after(Object objeto){

    }


    public void replaceElements(Node no, Object objeto){

    }

    public void swapElements(Node no, Object objeto){

    }

    public void insertBefore(Node no, Object objeto){

    }

    public void insertAfter(Node no, Object objeto){

    }

    public Object remove(Node no){

    }



    public boolean isFirst(Object objeto){
        return objeto == head.getElemento();
    }    

    public boolean isLast(Object objeto){
        return objeto == tail.getElemento();
    }


    public int size(){

    }

    public boolean isEmpty(){

    }


}