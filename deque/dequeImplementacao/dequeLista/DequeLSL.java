package deque.dequeImplementacao.dequeLista;

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

        if(tamanho == 0){ //vazio
            head = tail = no;
        }else{
            no.next = head;
            head = no;
        }
        tamanho++;
    }

    @Override
    public void addLast(Object objeto) throws DequeVazioException{
        no = new Node(objeto);

        if(tamanho == 0){ //vazio
            head = tail = no;
        }else{
            tail.next = no;
            tail = no;
        }
        tamanho++;
    }

    @Override
    public Object removeFirst(){
        if(tamanho == 0){
            throw new DequeVazioException("O deque está vazio!");
        }
        Object headTEMP = head.elemento;
        head = head.next;
        if(head == null){ //se o next aponta para null quer dizer que ficou vazia, entao tail tem que apontar pra null tbm
            tail = null;
        }
        tamanho--;
        return headTEMP; //retorna o elemento antes de ter sido removido 
    }

    @Override
    public Object removeLast(){
        if(tamanho == 0){
            throw new DequeVazioException("O deque está vazio!");
        }
        Object tailTEMP = tail.elemento; //armazenado para ser mostrado no return

        if(tail == head){ //so tem 1, então pra nao ter que seguir o laço so colocar os dois como null
            tail = head = null;
        }else{
            Node iTail = head;
            for(int i = 0; i < tamanho - 2 /* -2 pq além de ser o penultimo o tamanho é por qtd de elemtentos e nao indice */; i++){ //vai dar a volta na lista até chegar no penultimo no
                iTail = iTail.next; //incrementando até chegar no penultimo
            }
            tail = iTail; //no antes do tail atual agora será o tail
        }
        tamanho--;
        return tailTEMP; //retorna o elemento antes de ter sido removido
    }



    @Override
    public Object first(){
        if(tamanho == 0){
            throw new DequeVazioException("O deque está vazio!");
        }
        return head.elemento;
    }

    @Override
    public Object last(){
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
        return  tamanho == 0;
    }

}