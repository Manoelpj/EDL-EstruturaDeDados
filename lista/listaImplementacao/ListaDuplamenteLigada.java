package lista.listaImplementacao;

public class ListaDuplamenteLigada implements Lista{
    public Node no;
    public Node head, tail;

    public ListaDuplamenteLigada(){
        this.head = this.tail = null;
    }

    // feito
    public Object first() throws ListaVaziaException{
        if (tail == null && head == null) {
            throw new ListaVaziaException("A lista está vazia");
        }
        return head.getElemento();
    }

    // feito
    public Object last() throws ListaVaziaException{
        if (tail == null && head == null) {
            throw new ListaVaziaException("A lista está vazia");
        }
        return tail.getElemento();
    }

    // feito
    public Object before(Node no) throws ListaVaziaException{
        if (tail == null && head == null) {
            throw new ListaVaziaException("A lista está vazia");
        }
        return no.getPrev();
    }

    // feito
    public Object after(Node no) throws ListaVaziaException{
        if (tail == null && head == null) {
            throw new ListaVaziaException("A lista está vazia");
        }
        return no.getNext();
    }

    //feito
    public void replaceElements(Node no, Object objeto) throws ListaVaziaException{
        if (tail == null && head == null) {
            throw new ListaVaziaException("A lista está vazia");
        }  
        no.setElemento(objeto);
    }

    //feito
    public void swapElements(Node no1, Node no2) throws ListaVaziaException{
        if (tail == null && head == null) {
            throw new ListaVaziaException("A lista está vazia");
        }
        Object TEMP = no1.getElemento();
        no1.setElemento(no2.getElemento());
        no2.setElemento(TEMP);
    }


    // feito
    public void insertBefore(Node no, Object objeto) throws ListaVaziaException{
        if (tail == null && head == null) {
            throw new ListaVaziaException("A lista está vazia");
        }
        Node novo = new Node(objeto);

        novo.setNext(no); // padrão
        if(no == head){
            no.setPrev(novo);
            head = novo;
        }else{
            novo.setPrev(no.getPrev()); //seta o prev do Node novo para o prev do Node no
            no.getPrev().setNext(novo); //seta o next do prev do Node no para ser Node novo
            no.setPrev(novo);
        }
    }

    // feito
    public void insertAfter(Node no, Object objeto) throws ListaVaziaException{
        if (tail == null && head == null) {
            throw new ListaVaziaException("A lista está vazia");
        }
        Node novo = new Node(objeto);

        novo.setPrev(no); //padrao
        if(no == tail){
            no.setNext(novo);
            novo.setPrev(no);
            tail = novo;
        }else{
            novo.setNext(no.getNext());
            no.getNext().setPrev(novo); //seta o Node next do Node no para mirar em Node novo  
            no.setNext(novo);
        }
    }

    // feito
    public void insertFirst(Object objeto){
        no = new Node(objeto);

        if(head == null){
            head = tail = no;
        }else{
            no.setNext(head);
            head.setPrev(no);
            head = no;
        }
    }

    // feito
    public void insertLast(Object objeto){
        no = new Node(objeto);

        if(tail == null){
            tail = head = no;
        }else{
            no.setPrev(tail);
            tail.setNext(no);
            tail = no;
        }
    }

    // feito
    public void remove(Node no) throws ListaVaziaException{
        if (tail == null && head == null) {
            throw new ListaVaziaException("A lista está vazia");
        }
        Node prev = no.getPrev();
        Node next = no.getNext();

        if(prev == null){
            head = next;
        }else{
            prev.setNext(next);
        }

        if(next == null){
            tail = prev;
        }else{
            next.setPrev(prev);
        }
    }

    // feito
    public boolean isFirst(Object objeto){
        return objeto == head.getElemento();
    }    

    // feito
    public boolean isLast(Object objeto){
        return objeto == tail.getElemento();
    }

    // feito
    public int size(){
        Node iBusca = head;
        int i = 0;
        while(iBusca != null){
            iBusca = iBusca.getNext();
            i++;
        }
        return i;
    }

    // feito
    public boolean isEmpty(){
        return tail == null && head == null;
    }


    public void sout(){
        String lista = " ";
        Node i = head;
        while(i != null){
            lista += i.getElemento() + " ";
            i = i.getNext();
        }
        System.out.println(lista);
    }



}