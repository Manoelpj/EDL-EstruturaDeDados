public class PilhaMainArray{
    public static void main(String[] args){
        //metodos testados
            //push, fc do push, isEmpty, size, top, pop

        PilhaArray pilha = new PilhaArray(2, 0);
        
        pilha.push(111);
        pilha.push(222);
        pilha.push(333);
        // System.out.println(pilha.isEmpty());
        
        // System.out.println("Há " + pilha.size() + " elementos na pilha");

        pilha.push(444);

        // System.out.println("Há " + pilha.size() + " elementos na pilha"); 
        // System.out.println(pilha.top()); 

        pilha.pop();
        // System.out.println(pilha.top()); //removeu o último elemento
        pilha.pop();
        pilha.pop();
        pilha.pop();
        
        //Ambos disparam erro
        // System.out.println(pilha.pop());
        // System.out.println(pilha.top());
        // System.out.println(pilha.isEmpty());
    } 
}