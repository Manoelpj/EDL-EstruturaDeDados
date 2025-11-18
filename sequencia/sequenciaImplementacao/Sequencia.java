package sequencia.sequenciaImplementacao;

import lista.listaImplementacao.Node;
import vetor.vetorImplementacao.vetorArray.VetorOutRangeException;
import vetor.vetorImplementacao.vetorArray.VetorVazioExpection;

public interface Sequencia{

    //métodos de lista
    public Object first();
    public Object last();
    public Object before(Node no);
    public Object after(Node no);

    public void replaceElements(Node no, Object objeto);
    public void swapElements(Node no1, Node no2);
    public void insertBefore(Node no, Object objeto);    
    public void insertAfter(Node no, Object objeto);
    public void insertFirst(Object objeto);
    public void insertLast(Object objeto);
    public void remove(Node no);


    //métodos de vetor
    public Object elemAtRank(int rank) throws VetorVazioExpection, VetorOutRangeException;
    public Object replaceAtRank(int rank, Object objeto) throws VetorVazioExpection;
    public void insertAtRank(int rank, Object objeto) throws VetorOutRangeException;
    public Object removeAtRank(int rank) throws VetorVazioExpection, VetorOutRangeException;

    //métodos ponte
    public Node atRank(int rank);
    public int rankOf(Node no);


    //métodos genéricos
    public int size();
    public boolean isEmpty();
}