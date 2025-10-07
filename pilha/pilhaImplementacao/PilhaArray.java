import java.util.Arrays;

public class PilhaArray implements Pilha{
    private int capacidade;
    private final int fatorCrescimento;
    private int topo;
    private Object[] array;

    public PilhaArray(int capacidade, int fatorCrescimento){
        this.capacidade = capacidade;
        this.fatorCrescimento = fatorCrescimento;
        this.topo = -1;
        this.array = new Object[capacidade];
    }

    @Override
    public void push(Object objeto){
        if (topo+1 == capacidade) {            
            if(fatorCrescimento == 0){
                capacidade*=2;
            }else if(fatorCrescimento > 0){ //fatorCrescimento não pode ser menor que zero, né? Pq um array iria diminuir sua capacidade, meio sem lógica
                capacidade+=fatorCrescimento;
            }
            Object[] array2 = new Object[capacidade];
            for(int i = 0; i <= topo; i++){
                array2[i] = array[i];
            }
            array = array2;
        }
        array[++topo] = objeto;
    }

    @Override
    public Object pop() throws PilhaVaziaExcecao{ //tem que retornar o topo atual ou o topo antigo? Se for o topo antigo está correto, porém se for o topo atual(dps do pop apagar o atual) está incorreto.
        if(topo == -1){
            throw new PilhaVaziaExcecao("A pilha está vazia");
        }
        return array[topo--];
    }

    @Override
    public Object top() throws PilhaVaziaExcecao{
        if(topo == -1){
            throw new PilhaVaziaExcecao("A pilha está vazia");
        }
        return array[topo];
    }

    @Override
    public int size(){
        return topo+1;
    }

    @Override
    public boolean isEmpty(){
        return topo == -1;
    }

    public void sout(){
        System.out.println(Arrays.toString(array));
    }



    //métodos extras que envolvem resolver questões das listas\\

    // questao 04 lista 1 de pilha 
    public void empty(){ //esvazie a pilha descartando todos os seus elementos.
        topo=-1;
    }


    
}