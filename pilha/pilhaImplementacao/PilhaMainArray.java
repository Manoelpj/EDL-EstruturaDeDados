public class PilhaMainArray{
    public static void main(String[] args){
        PilhaArray pilha = new PilhaArray(1, 0);
        
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);

        pilha.sout(); 
        System.out.println("Há " + pilha.size() + " elementos na pilha"); 
        
        pilha.pop();
        System.out.println(pilha.top());
        pilha.pop();
        pilha.pop();
        pilha.pop();
        pilha.pop();
        System.out.println(pilha.isEmpty());
        System.out.println(pilha.size());
    } 
}