public class PilhaMainArray{
    public static void main(String[] args){
        PilhaArray pilha = new PilhaArray(1, 0);
        PilhaArray pilha2 = new PilhaArray(5,0);
        
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);


        pilha2.push("A");
        pilha2.push("B");
        pilha2.push("C");
        pilha2.push("D");
        pilha2.push("E");


        pilha.adicionarPilha(pilha2);
        pilha.sout(); 



        
        // System.out.println("Há " + pilha.size() + " elementos na pilha"); 
        
        // pilha.pop();
        // pilha.pop();
        // pilha.pop();
        // System.out.println(pilha.top());
        // System.out.println(pilha.isEmpty());
        // System.out.println(pilha.size());




        //teste do exercicio 04 - método empty()
        // pilha.empty();
        // System.out.println(pilha.size());
        // System.out.println(pilha.isEmpty());
        // pilha.sout(); 
    } 
}