package deque.dequeImplementacao.dequeVector;

public class DequeMain{
    public static void main(String[] args){
        DequeVector deque = new DequeVector();

        // System.out.println(deque.size()); 
        // System.out.println(deque.isEmpty()); 


        deque.addFirst(4);
        deque.addFirst(3);
        deque.addFirst(2);
        deque.addFirst(1);

        deque.addLast("A");
        deque.addLast("B");
        deque.addLast("C");

        // System.out.println(deque.first()); 
        // System.out.println(deque.last());  

        System.out.println(deque.removeFirst()); 
        System.out.println(deque.removeLast()); 

        deque.sout();
    }
}