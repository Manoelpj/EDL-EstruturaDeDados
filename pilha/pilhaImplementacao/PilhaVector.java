// questao 06 lista 1 de pilha
import java.util.Vector;

public class PilhaVector implements Pilha{
    Vector<Object> vector;
    int topo;

    public PilhaVector(){
        this.vector = new Vector<>();
        this.topo = -1;
    }

    @Override
    public void push(Object objeto){
        vector.add(objeto);
        topo++;
    }

    @Override
    public Object pop() throws PilhaVaziaExcecao{
        if(topo==-1){
            throw new PilhaVaziaExcecao("A pilha está vazia");
        }
        
        return vector.remove(topo--);
    }

    @Override
    public Object top(){
        if(topo==-1){
            throw new PilhaVaziaExcecao("A pilha está vazia");
        }
        return vector.get(topo);
    }

    @Override
    public int size(){
        return topo+1;
        //alternativa:
        //return vector.size();
    }

    @Override
    public boolean isEmpty(){
        return topo==-1;
    }






    public void sout(){
        System.out.println(vector);
    }

}
