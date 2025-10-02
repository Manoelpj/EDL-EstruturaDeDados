package dequeLista;

public class DequeLSLMain{
    public static void main(String[] args){
        DequeLSL deque = new DequeLSL();

        deque.addFirst(4);
        deque.addFirst(3);
        deque.addFirst(2);
        deque.addFirst(1); //head

        deque.addLast("A"); //tail

        System.out.println(deque.first()); //1
        System.out.println(deque.last()); //"A"


        System.out.println(deque.removeFirst()); // retorna 1 e agora o head é 2
        System.out.println(deque.removeLast()); // retorna "A" e agora o tail é 4


        System.out.println(deque.isEmpty()); //false
        System.out.println("No deque há " + deque.size() + " elementos"); //5

    }
}