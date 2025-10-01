package dequeLista;

public class Node {
    public Object elemento;
    public Node next;
    public Node prev;

    public Node(Object elemento){
        this.elemento = elemento;
        this.next = null;
        this.prev = null;
    }

    public Object getElemento(){
        return elemento;
    }
    public void setElemento(Object objeto){
        elemento = objeto;
    }
}