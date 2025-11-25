package deque.dequeImplementacao.dequeVector;

import java.util.Vector;

public class DequeVector implements Deque {
    Vector<Object> vector;


    public DequeVector(){
        this.vector = new Vector<>();
    }

    @Override
    public void addFirst(Object objeto){
        vector.add(0, objeto);
    }

    @Override
    public void addLast(Object objeto){
        vector.add(objeto);
    }

    @Override 
    public Object removeFirst(){
        return vector.remove(0);
    }

    @Override
    public Object removeLast(){
        return vector.remove(vector.size()-1);
    }

    @Override 
    public Object first(){
        return vector.get(0);
    }

    @Override
    public Object last(){
        return vector.get(vector.size()-1);
    }

    @Override
    public int size(){
        return vector.size();
    }

    @Override
    public boolean isEmpty(){
        return vector.isEmpty();
    }



    public void sout(){
        System.out.println(vector);
    }
}
