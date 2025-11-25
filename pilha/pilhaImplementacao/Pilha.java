package pilha.pilhaImplementacao;

public interface Pilha{

    public void push(Object objeto);

    public Object pop() throws PilhaVaziaExcecao;

    public Object top() throws PilhaVaziaExcecao;
    
    public int size();

    public boolean isEmpty();
}



