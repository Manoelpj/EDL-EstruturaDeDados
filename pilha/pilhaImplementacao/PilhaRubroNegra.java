import java.util.Arrays; 

public class PilhaRubroNegra{
    public int capacidade;
    public int topoNegro, topoRubro;
    public Object[] array;

    public PilhaRubroNegra(int capacidade){
        this.capacidade = capacidade;
        this.topoRubro = -1;
        this.topoNegro = capacidade;
        this.array = new Object[capacidade];
    }

    // PUSH \\ feito, obs: talvez a copia deve ter como condicao >= ou <= e nao só < ou >
    public void pushRubro(Object objeto){
        if((topoRubro+1/*qtd elementos*/) +  (capacidade-topoNegro/*qtd elementos*/) == capacidade){ //pilha cheia
            // """Se a pilha rubro mais a pilha negra forem igual a capacidade, quer dizer que o array está cheio""" \\
            Object[] array2 = new Object[capacidade*2]; 
            /*Rubro*/
            for(int i=0; i <= topoRubro;i++){
                array2[i] = array[i];    
            }
            /*Negro*/
            for(int i = capacidade-1; i >= topoNegro; i--){
                array2[i] = array[i];
            }
            array = array2;
            /*Atualizar topoNegro para o array duplicado*/
            topoNegro-=capacidade;
            capacidade*=2;
            //o topoNegro deve voltar a quantidade de casas da capacidade atual antes de dobrar, logo, antes de dobrar a capacidade geral o topo tem que receber topoNegro-= capacidade; para que possamos dobrar a capacidade em capacidade*=2;
        }
        array[++topoRubro] = objeto;
    }

    public void pushNegro(Object objeto){
        if((topoRubro+1/*qtd elementos*/) +  (capacidade-topoNegro/*qtd elementos*/) >= capacidade){ //pilha cheia
            // """Se a pilha rubro mais a pilha negra forem igual a capacidade, quer dizer que o array está cheio""" \\
            Object[] array2 = new Object[capacidade*2];
            /*Rubro*/
            for(int i=0; i <= topoRubro;i++){
                array2[i] = array[i];    
            }
                

            /*Negro*/
            for(int i = capacidade-1; i >= topoNegro; i--){
                array2[i] = array[i];
            }
            array = array2;
            /*Atualizar topoNegro para o array duplicado*/
            topoNegro+=capacidade;
            capacidade*=2;
            //o topoNegro deve voltar a quantidade de casas da capacidade atual antes de dobrar, logo, antes de dobrar a capacidade geral o topo tem que receber topoNegro-= capacidade; para que possamos dobrar a capacidade em capacidade*=2;
        }
        array[++topoNegro] = objeto;
    }
    // PUSH \\



    // POP \\
    public Object popRubro() throws PilhaVaziaExcecao{
        if(topoRubro == -1){
            throw new PilhaVaziaExcecao("A pilha rubro está vazia");
        }
        if((capacidade - topoNegro) + (topoRubro+1) == capacidade/3){
            // """Diminuir tamanho do array pela metade caso as pilhas só consumam um terço do array atual""" \\
            Object[] array2 = new Object[capacidade/2];
            /*Rubro*/
            for(int i = 0; i < topoRubro;i++){
                array2[i]=array[i];
            }
            /*Negro*/
            for(int i = capacidade-1; i < topoNegro; i--){
                array2[i]=array[1];
            }
            array = array2;
            topoNegro-=capacidade;
            capacidade/=2;
        }
        // return certo
        // return array[topoRubro--];

        // testar só
        Object returnValor = array[topoRubro];
         array[topoRubro] == null;
        return returnValor;

    }
    public Object popNegro() throws PilhaVaziaExcecao{
        if(topoNegro == capacidade){
            throw new PilhaVaziaExcecao("A pilha negra está vazia");
        }
        if((capacidade - topoNegro) + (topoRubro+1) == capacidade/3){
            // """Diminuir tamanho do array pela metade caso as pilhas só consumam um terço do array atual""" \\
            Object[] array2 = new Object[capacidade/2];
            /*Rubro*/
            for(int i = 0; i < topoRubro;i++){
                array2[i]=array[i];
            }
            /*Negro*/
            for(int i = capacidade-1; i < topoNegro; i--){
                array2[i]=array[1];
            }
            array = array2;
            topoNegro-=capacidade;
            capacidade/=2;
        }
        return array[topoNegro--];
    }
    // POP \\



    // SIZE \\     //feito, porém com ressalvas
    public int sizeRubro(){
        return topoRubro+1;
    }
    public int sizeNegro(){
        return topoNegro - capacidade; // talvez dê erro aq na quantidade, pode ser capacidade-1 ; testar
    }
    // SIZE \\



    // TOP \\     //feito
    public Object topRubro() throws PilhaVaziaExcecao{
        if(topoRubro == -1){
            throw new PilhaVaziaExcecao("A pilha Rubro está vazia");
        }
        return array[topoRubro];
    }
    public Object topNegro() throws PilhaVaziaExcecao{
        if(topoNegro == capacidade){
            throw new PilhaVaziaExcecao("A pilha Negro está vazia");
        }
        return array[topoNegro];
    }
    // TOP \\



    // ISEMPTY \\     //feito
    public boolean isEmptyRubro(){
        return topoRubro == -1;
    }
    public boolean isEmptyNegro(){
        return topoNegro == capacidade;
    }
    // ISEMPTY \\






    // SOUT \\     //ver como o array está se comportando
    public void sout(){
        System.out.println(Arrays.toString(array));
    }
    // SOUT \\
}




//metodos
//sizeNegro, sizeRubro
//topNegro, topRubro
//popNegro, popRubro
//isEmptyNegro, isEmptyRubro
//pushNegro, pushRubro


//atributos
//topoNegro, topoRubro
//capacidade
//object[] array
//