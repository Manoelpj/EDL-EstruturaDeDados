package sequencia.sequenciaImplementacao;

import lista.listaImplementacao.ListaDuplamenteLigada;
import lista.listaImplementacao.Node;
import vetor.vetorImplementacao.vetorArray.VetorOutRangeException;
import vetor.vetorImplementacao.vetorArray.VetorVazioExpection;

public class SequenciaLista implements Sequencia{
    int tamanho;
    ListaDuplamenteLigada lista;

    public SequenciaLista(){
        this.tamanho = 0;
        this.lista = new ListaDuplamenteLigada();
    }



    public Object first(){
        return lista.first();
    }

    public Object last(){
        return lista.last();
    }

    public Object before(Node no){
        return lista.before(no);
    }

    public Object after(Node no){
        return lista.after(no);
    }


    public void replaceElements(Node no, Object objeto){
        lista.replaceElements(no, objeto);
    }

    public void swapElements(Node no1, Node no2){
        lista.swapElements(no1, no2);
    }

    public void insertBefore(Node no, Object objeto){
        lista.insertBefore(no, objeto);
        tamanho++;
    }   

    public void insertAfter(Node no, Object objeto){
        lista.insertAfter(no, objeto);
        tamanho++;
    }

    public void insertFirst(Object objeto){
        lista.insertFirst(objeto);
        tamanho++;
    }

    public void insertLast(Object objeto){
        lista.insertLast(objeto);
        tamanho++;
    }

    public void remove(Node no){
        lista.remove(no);
        tamanho--;
    }



    public Object elemAtRank(int rank) throws VetorVazioExpection, VetorOutRangeException{
        if(tamanho == 0){
            throw new VetorVazioExpection("A sequência está vazia");
        }
        if(rank < 0 || rank >= tamanho){
            throw new VetorOutRangeException("O rank está fora do range");
        }
        return atRank(rank).getElemento();
    }

    public Object replaceAtRank(int rank, Object objeto) throws VetorVazioExpection{
        if(tamanho == 0){
            throw new VetorVazioExpection("A sequência está vazia");
        }
        Object TEMP = atRank(rank).getElemento();
        lista.replaceElements(atRank(rank), objeto);
        return TEMP;
    }

    public void insertAtRank(int rank, Object objeto) throws VetorOutRangeException{
        if(rank < 0 || rank > tamanho){
            throw new VetorOutRangeException("O rank está fora do range");
        }
        
        if(tamanho==0){
            lista.insertLast(objeto);
        }else if(rank == 0){
            lista.insertFirst(objeto);
        }else if(rank == tamanho){
            lista.insertLast(objeto);
        }else{
            lista.insertBefore(atRank(rank), objeto);
        }
        tamanho++;
    }

    public Object removeAtRank(int rank) throws VetorVazioExpection, VetorOutRangeException{
        if(tamanho == 0){
            throw new VetorVazioExpection("A sequência está vazia");
        }
        if(rank < 0 || rank >= tamanho){
            throw new VetorOutRangeException("O rank está fora do range");
        }
        Object TEMP = atRank(rank).getElemento();
        lista.remove(atRank(rank));
        tamanho--;
        return TEMP;
    }


    
    public Node atRank(int rank) throws VetorOutRangeException{
        if(rank < 0 || rank >= tamanho){
            throw new VetorOutRangeException("O rank está fora do range");
        }

        Node i = lista.head;
        int count = 0;
        while(count < rank && i != null){
            i = i.getNext();
            count++;
        }
        return i;
    }

    public int rankOf(Node no){
        Node i = lista.head;
        int rank = 0;
        while(i != null){
            if(i == no){
                return rank;
            }
            i = i.getNext();
            rank++;
        }
        throw new VetorOutRangeException("Nó não pertence à sequência");
    }

    public int size(){
        return tamanho;
    }

    public boolean isEmpty(){
        return tamanho == 0;
    }


}
