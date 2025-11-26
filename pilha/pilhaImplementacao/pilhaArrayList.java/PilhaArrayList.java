package pilha.pilhaImplementacao.pilhaArrayList;

public class PilhaArrayList implements Pilha{
    public ArrayList<Object> array;

    public PilhaArrayList(){
        this.array = new ArrayList<>();
    }

    @Override
    public void push(Object objeto){
       array.addLast(objeto);
    }

    @Override
    public Object pop(){
        return array.removeLast();
    }

    @Override
    public Object top(){
        return array.getLast();
    }


    @Override
    public int size(){
        return array.size();
    }

    @Override
    public boolean isEmpty(){
        return array.isEmpty();
    }
}