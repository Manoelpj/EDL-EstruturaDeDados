import java.util.Arrays;

public class PilhaArray implements Pilha{
    private int capacidade;
    private final int fatorCrescimento;
    private int topo;
    private Object[] array;

    public PilhaArray(int capacidade, int fatorCrescimento){
        this.capacidade = capacidade;
        this.fatorCrescimento = fatorCrescimento;
        this.topo = -1;
        this.array = new Object[capacidade];
    }

    @Override
    public void push(Object objeto){
        if (topo+1 == capacidade) {            
            if(fatorCrescimento == 0){
                capacidade*=2;
            }else if(fatorCrescimento > 0){ //fatorCrescimento não pode ser menor que zero, né? Pq um array iria diminuir sua capacidade, meio sem lógica
                capacidade+=fatorCrescimento;
            }
            Object[] array2 = new Object[capacidade];
            for(int i = 0; i <= topo; i++){
                array2[i] = array[i];
            }
            array = array2;
        }
        array[++topo] = objeto;
    }

    @Override
    public Object pop() throws PilhaVaziaExcecao{ //tem que retornar o topo atual ou o topo antigo? Se for o topo antigo está correto, porém se for o topo atual(dps do pop apagar o atual) está incorreto.
        if(topo == -1){
            throw new PilhaVaziaExcecao("A pilha está vazia");
        }
        return array[topo--];
    }

    @Override
    public Object top() throws PilhaVaziaExcecao{
        if(topo == -1){
            throw new PilhaVaziaExcecao("A pilha está vazia");
        }
        return array[topo];
    }

    @Override
    public int size(){
        return topo+1;
    }

    @Override
    public boolean isEmpty(){
        return topo == -1;
    }

    public void sout(){
        System.out.println(Arrays.toString(array));
    }



    //métodos extras que envolvem resolver questões das listas\\

    // questao 04 lista 1 de pilha 
    public void empty(){ //esvazie a pilha descartando todos os seus elementos.
        topo=-1;
    }

    // questao 07 lista 1 de pilha 
    public void adicionarPilha(PilhaArray pilha2){ //insira os elementos de uma pilha dentro de outra pilha
        int tamanhoPilha2 = pilha2.size();
        for(int i = 0; i < tamanhoPilha2; i++){
            Object temp = pilha2.pop();
            push(temp);
        }
    } 


    // 8. Em uma expressa aritmética os símbolos de parentização parênteses (()), colchetes ([]) e chaves ({}) devem ser balanceados e apropriadamente aninhados. Apresente um algoritmo, em pseudo-código, que verifica se uma determinada expressão aritmética é correta ou não. O algoritmo deve executar em tempo O(n), onde n é a quantidade de caracteres da expressão e deve usar uma pilha como estrutura de dados auxiliar (C-4.6).

    //deve conter tres variaveis para parenteses inicial, colchetes inicial e chaves iniciais. Sempre que aparecer o "(" ou "{" ou "[" o sistema deve pegar a variavel e por adicionar 1 -- exemplo: parenteseInicial++; e quando aparecer um parenteses final diminuir por um com parenteSeInicial--; e no final do código se algum inicial estiver diferente de 0 deve informar que a expressão aritmética está incorreta.

    public String expressaoAritmeticaSimbolos(){
        int parenteseInicial = 0, colcheteInicial = 0, chaveInicial = 0;
        
        for(int i = 0; i <= topo; i++){
            //contabilizar a inicialização dos simbolos, validar o aninhamento entre eles e não permitir abertura de um simbolo igual a outro que já está aberto. Ex: para um parenteses abrir outro parenteses deve estar já fechado.
            if(array[i] == "("){
                if(parenteseInicial != 0){
                    return "O parentese atual deve estar fechado antes de abrir outro."; //o parentese deve estar fechado para abrir outro.
                }
                parenteseInicial++;

            }else if(array[i] == "["){
                if(parenteseInicial != 0 || colcheteInicial != 0) {
                    return "Não pode haver um parentese aberto ou um colchete aberto antes de abrir um colchete."; // nao pode ter um parenteses aberto nem que outro colchete esteja já aberto.
                }
                colcheteInicial++;

            }else if(array[i] == "{"){
                if(parenteseInicial != 0 || colcheteInicial != 0 || chaveInicial !=0) {
                    return "Não pode havar um parentese aberto ou um colchete aberto ou uma chave aberta antes de abrir uma chave"; // nao pode ter um parenteses aberto, também não pode ter um colchete aberto e muito menos uma chave já aberta. Os 3 devem estar fechados para que seja possível ter outra chaveInicial.
                } 
                chaveInicial++;
            }

            //contabilizar o fechamento de simbolos. Os simbolos devem fechar em ordem de prioridade, um parenteses aberto deve fechar antes de um colchete
            if(array[i] == ")"){
                if(parenteseInicial == 0) {
                    return "Não pode haver um parenteses aberto antes de fechar um parenteses"; // nao pode ter um parenteses aberto. Também não pode adicionar um colchete final enquanto colcheteInicial for igual a 0
                }
                parenteseInicial--;

            }else if(array[i] == "]"){
                if(parenteseInicial != 0 || colcheteInicial == 0) {
                    return "Não pode haver um parenteses aberto ou nenhum colchete aberto antes de fechar um colchete"; // nao pode ter um parenteses aberto. Também não pode adicionar um colchete final enquanto colcheteInicial for igual a 0
                }
                colcheteInicial--;

            }else if(array[i] == "}"){
                if(parenteseInicial != 0 || colcheteInicial != 0 || chaveInicial == 0) {
                    return "Nao pode haver um parenteses aberto ou um colchete aberto ou nenhuma chave aberta antes de fechar uma chave."; // nao pode ter um parenteses aberto e nem um colchete aberto. Também não pode adicionar uma chave final enquanto chaveInicial for igual a 0
                }
                chaveInicial--;
            }

        }

        int retorno = parenteseInicial + colcheteInicial + chaveInicial;
        // return retorno == 0; //deixar esse aq
        if(retorno == 0){
            return "Retornou tudo 0, então todos os símbolos estão FECHADOS";
        }else{
            return "Retornou diferente de 0, então há algum(ns) símbolo(s) ABERTO(S)";
        }
    }
}
//lembrar de fazer a verificação antes de fechar. Para uma chave fechar precisa que colcheteInicial e parenteseInicial sejam 0 ambos, pois chaves nao pode fechar com um deles ainda aberto. Também é válido para o colchetes, ele não pode fechar enquanto parenteseInicial não for 0. Parênteses não tem esse problema, podem fechar quando quiserem.