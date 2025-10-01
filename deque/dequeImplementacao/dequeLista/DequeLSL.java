package dequeLista;

public class DequeLSL implements Deque{
    public Node no;
    public Node head, tail;
    public int tamanho;

    public DequeLSL(){
        this.head = null; 
        this.tail = null;
        this.tamanho = 0; 
    }


    @Override
    public void addFirst(Object objeto){
        no = new Node(objeto);

        no.next = head;
        head = no;
        tamanho++;

    }

    @Override
    public void addLast(Object objeto){
        no = new Node(objeto);

        tail.next = no;
        tail = no;
    }

    @Override
    public Object removeFirst(){
        Object headTEMP = head.elemento;
        head = head.next;
        tamanho--;
        return headTEMP;
    }

    @Override
    public Object removeLast(){
        Object tailTEMP = tail.elemento;
        tail = tail.next;
        tamanho--;
        return tailTEMP;
    }





    @Override
    public Object first(){
        return head.elemento;
    }

    @Override
    public Object last(){
        return tail.elemento;
    }

    @Override
    public int size(){
        return tamanho;
    }

    @Override
    public boolean isEmpty(){
        return  tamanho == 0;
    }

}