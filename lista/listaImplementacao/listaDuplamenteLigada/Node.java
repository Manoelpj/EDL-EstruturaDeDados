package lista.listaImplementacao.listaDuplamenteLigada;

public class Node{
    private Object elemento;
    private Node next;
    private Node prev;

    public Node(Object elemento){
        this.elemento = elemento;
        this.next = this.prev = null;
    }

    public Object getElemento(){
        return elemento;
    }

    public void setElemento(Object objeto){
        elemento = objeto;
    }

    public Node getNext(){
        return next;
    }
    
    public void setNext(Node no){
        next = no;
    }

    public Node getPrev(){
        return prev;
    }

    public void setPrev(Node no){
        prev = no;
    }

}


