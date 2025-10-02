package dequeLista;

public class DequeLDLMain {
    public static void main(String[] args){
        DequeLDL deque = new DequeLDL();

        deque.addFirst(4);
        deque.addFirst(3);
        deque.addFirst(2);
        deque.addFirst(1); //head

        deque.addLast("A"); 
        deque.addLast("B");
        deque.addLast("C"); //tail


        // System.out.println(deque.first()); // imprime 1, que é o head
        // System.out.println(deque.last()); //imprime o C, que é o tail
        
        System.out.println(deque.removeLast()); // imprime e remove C
        System.out.println(deque.removeLast()); // imprime e remove B
        
        // System.out.println(deque.removeFirst()); // imprime e remove 1
        // System.out.println(deque.removeFirst()); // imprime e remove 2


        System.out.println("Há " + deque.size() + " elementos");
        // System.out.println(deque.isEmpty());
        
    }
}
