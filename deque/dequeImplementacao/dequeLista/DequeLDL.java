package deque.dequeImplementacao.dequeLista;

public class DequeLDL implements Deque {
    public Node no;
    public Node head, tail;
    public int tamanho;

    public DequeLDL(){
        this.head = null;
        this.tail = null;
        this.tamanho = 0;
    }
    

    @Override   
    public void addFirst(Object objeto){
        no = new Node(objeto);

        if(head == null){
            head = tail = no; //se estiver vazio antes da adição então o tail tbm recebe o mesmo no
        }else{
            no.next = head;
            head.prev = no;
            head = no;
        }
        tamanho++;
    }
    
    @Override   
    public void addLast(Object objeto){
        no = new Node(objeto);
        if(tail == null){
            tail = head = no; //se estiver vazio antes da adição então head tbm recebe o mesmo no
        }else{
            tail.next = no;
            no.prev = tail;
            tail = no;
        }
        tamanho++;
    }
    
    @Override   
    public Object removeFirst() throws DequeVazioException{
        if(tamanho == 0){
            throw new DequeVazioException("O deque está vazio!");
        }
        Object headTEMP = head.elemento;
        head = head.next;
        if(head == null){
            tail = null;
        }
        tamanho--;
        return headTEMP;
    }
    
    @Override   
    public Object removeLast() throws DequeVazioException{
        if(tamanho == 0){
            throw new DequeVazioException("O deque está vazio!");
        }
        Object tailTEMP = tail.elemento;
        tail = tail.prev;
        if(tail == null){
            head = null;
        }
        tamanho--;
        return tailTEMP;
    }
    
    @Override   
    public Object first() throws DequeVazioException{
        if(tamanho == 0){
            throw new DequeVazioException("O deque está vazio!");
        }
        return head.elemento;
    }
    
    @Override   
    public Object last() throws DequeVazioException{
        if(tamanho == 0){
            throw new DequeVazioException("O deque está vazio!");
        }
        return tail.elemento;
    }
    
    @Override   
    public int size(){
        return tamanho;
    }
    
    @Override   
    public boolean isEmpty(){
        return tamanho == 0;
    }
}
