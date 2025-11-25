package VetLisSeq.vetor.vetorImplementacao.vetorArray;

import java.util.Arrays;

public class VetorArray implements Vetor{
    // array normal
    int capacidade;
    int tamanho;
    Object[] array;

    public VetorArray(int capacidade){
        this.capacidade = capacidade;
        this.tamanho = 0;
        this.array = new Object[capacidade];
    }


    @Override
    public Object elemAtRank(int rank) throws VetorVazioExpection{
        if(isEmpty()){
            throw new VetorVazioExpection("O Vetor está vazio");
        }
        if(rank >= tamanho){
            throw new VetorOutRangeException("O rank está fora do escopo do Vetor");
        }
        return array[rank];
    }


    @Override
    public Object replaceAtRank(int rank, Object objeto) throws VetorVazioExpection{
        if(isEmpty()){
            throw new VetorVazioExpection("O Vetor está vazio");
        }
        Object elemAntigo = array[rank];
        array[rank] = objeto;
        return elemAntigo;
    }


    @Override
    public void insertAtRank(int rank, Object objeto) throws VetorOutRangeException{
        if(rank >= capacidade){
            throw new VetorOutRangeException("O rank está fora do escopo do Vetor");
        }
        if(tamanho == capacidade-1){ //se forem iguais é pq tá cheio
            Object[] array2 = new Object[capacidade*2];
            for(int i = 0; i <= tamanho; i++){
                array2[i] = array[i];
            }
            array = array2;
            capacidade*=2;
        }        
        if(rank < tamanho){
            int i = tamanho-1;
            while(i >= rank){
                array[i+1] = array[i];
                i--;
            }
        }
        // if(array[rank] == null){} //quer dizer que vai ser inserido no final, então não precisa mandar ngm pra frente
        array[rank] = objeto;
        tamanho++;
    }


    @Override
    public Object removeAtRank(int rank) throws VetorVazioExpection{
        if(isEmpty()){
            throw new VetorVazioExpection("O Vetor está vazio");
        }
        Object elemAntigo = array[rank];
        for(int i = rank; i < tamanho-1; i++){
            array[i] = array[i+1];
        }
        tamanho--;
        return elemAntigo;
        // obs: o valor final do tamanho-1 não é apagado
    }


    @Override
    public int size(){
        return tamanho;
    }


    @Override
    public boolean isEmpty(){
        return tamanho == 0;
    }

    //teste
    public void sout(){
        System.out.println(Arrays.toString(array));
    }
}
