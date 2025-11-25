package VetLisSeq.vetor.vetorImplementacao.vetorLista;

import VetLisSeq.vetor.vetorImplementacao.vetorArray.Vetor;
import VetLisSeq.vetor.vetorImplementacao.vetorArray.VetorVazioExpection;
import VetLisSeq.vetor.vetorImplementacao.vetorArray.VetorOutRangeException;
import VetLisSeq.lista.listaImplementacao.ListaDuplamenteLigada;
import VetLisSeq.lista.listaImplementacao.Node;



public class vetorLista implements Vetor{
    public int tamanho;
    public ListaDuplamenteLigada lista;

    public vetorLista(){
        this.tamanho = 0;
        this.lista = new ListaDuplamenteLigada();
    }

    //feito
    protected Node indexVsnode(int rank) throws VetorOutRangeException{
        Node i = lista.head;
        int count = 0;
        while(count < rank && i != null){
            i = i.getNext();
            count++;
        }

        if(i == null){
            throw new VetorOutRangeException("Indice fora do range");
        }
        return i;
    }

    //feito
    public Object elemAtRank(int rank) throws VetorVazioExpection, VetorOutRangeException{
        if(tamanho == 0){
            throw new VetorVazioExpection("Vetor vazio");
        }
        if(rank < 0 || rank >= tamanho){
            throw new VetorOutRangeException("Indice fora do range");
        }

        return indexVsnode(rank).getElemento();
    }

    //feito
    public Object replaceAtRank(int rank, Object objeto) throws VetorOutRangeException{
        if(rank < 0 || rank >= tamanho){
            throw new VetorOutRangeException("Indice fora do range");
        }
        Object TEMP = indexVsnode(rank).getElemento();
        lista.replaceElements(indexVsnode(rank), objeto);
        return TEMP;
    }

    //feito
    public void insertAtRank(int rank, Object objeto) throws VetorOutRangeException{
        if(rank < 0 || rank > tamanho){
            throw new VetorOutRangeException("Indice fora do range");
        }


        if(tamanho == 0){
            lista.insertLast(objeto);
        }
        else if(rank == 0){
            lista.insertFirst(objeto);
        }else if(rank == tamanho){
            lista.insertLast(objeto);
        }else{
            lista.insertBefore(indexVsnode(rank), objeto);
        }
        tamanho++;
    }

    //feito
    public Object removeAtRank(int rank) throws VetorVazioExpection, VetorOutRangeException{
        if(tamanho == 0){
            throw new VetorVazioExpection("Vetor vazio");
        }
        if(rank < 0 || rank >= tamanho){
            throw new VetorOutRangeException("Indice fora do range");
        }
        Object TEMP = indexVsnode(rank).getElemento();
        lista.remove(indexVsnode(rank));
        tamanho--;
        return TEMP;
    }

    //feito
    public int size(){
        return tamanho;
    }

    //feito
    public boolean isEmpty(){
        return tamanho == 0;
    }
}