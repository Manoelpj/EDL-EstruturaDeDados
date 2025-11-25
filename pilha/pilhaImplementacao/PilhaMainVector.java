package pilha.pilhaImplementacao;

// questao 06 lista 1 de pilha
public class PilhaMainVector{
    public static void main(String[] args){
        PilhaVector pilha = new PilhaVector();

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);
        pilha.push(6);

        System.out.println("O elemento que está sendo removido é " + pilha.pop()); 

        System.out.println("Qual elemento está no topo da pilha? " + pilha.top());

        System.out.println("Há " + pilha.size() + " elementos"); 

        System.out.println("A pilha está vazia? " + pilha.isEmpty());


        pilha.sout();
    }
}