import java.util.Arrays;

public class FilaArray implements Fila{
    public int capacidade, inicioFila, finalFila;
    public Object[] array; //circular
    public Object elementoFinal;


    public FilaArray(int capacidade){
        this.capacidade = capacidade;
        this.array = new Object[capacidade];
        this.inicioFila = -1;
        this.finalFila = 0; //final da fila deve estar sempre vazio e ser um indice na frente de inicio justamente pra manter o array circular
        this.elementoFinal = "F";

    }

    @Override
    public void enqueue(Object objeto){
        if(size() == capacidade){ //fila cheia
            Object[] array2 = new Object[capacidade*2]; //duplica a capacidade e cria um array novo
            iInicioFila = inicioFila
            for(int i = 0; i < capacidade-1; i++){
                array2[i] = array[iInicioFila++];
                iInicioFila = (iInicioFila+1) % capacidade;
            }
            array = array2;
        }
        array[finalFila] = objeto;
        finalFila = (finalFila+1) % capacidade //atualiza o indice de finalFila de maneira circular
        array[finalFila] = "F" //TESTES NAO MANTER final da fila recebe "F" TESTES NAO MANTER\\
    }

    public Object dequeue() throws FilaVaziaException{
        if(inicioFila < 0){
            throw new FilaVaziaException("A fila está vazia")
        }
        // vazia exception
        Obejct valorTEMP = array[inicioFila];
        array[inicioFila] = "APAGADO" //TESTES NAO MANTER por valor pra ter noção de que foi apagado TESTE NAO MANTER\\
        inicioFila = (inicioFila+1) % capacidade;
        return valorTEMP;
    }

    public Object first() throws FilaVaziaException{
        if(inicioFila < 0){
            throw new FilaVaziaException("A fila está vazia")
        }
        return inicioFila;
    }

    public int size(){
        return (finalFinal - inicioFila + capacidade) % capacidade;
    }

    public boolean isEmpty(){
        return inicioFila == -1;
    }


    // MÉTODO PARA TESTES: SOUT \\
    public void sout(){
        System.out.println(Arrays.toString(array));
    }
    // MÉTODO PARA TESTES: SOUT \\
}







        // if(size() >= capacidade){ //fila cheia
        //     if(fatorCrescimento == 0){ 
        //         capacidade*=2;
        //     }else{
        //         capacidade+=fatorCrescimento;
        //     }

        //     Object[] array2 = new Object[capacidade]; //capacidade aumentada já;
        //     for(int i = 0; inicioFila < finalFila; i++){ //OBS: considerando que após o array aumentar sua capacidade os elementos se mantêm no mesmo indice, pois eles não precisam estar no final do array.
        //         array2[i] = array[inicioFila];
        //         inicioFila = (inicioFila +1) % capacidade;
        //     }
        //     inicioFila=0; //após o aumento do array, na realocação dos elementos o inicio da fila será sempre o indíce 0;
        // }
        // array[finalFila] = objeto;
        // finalFila = (finalFila + 1) % capacidade; //o resto da divisão informa o indice que é para ir o finalFila após a adição de mais um elemento na fila, permite que o array seja circular.
        
        // //alternativa
        // // if(finalFila == capacidade-1){ //finalFila está no último indice, quando inserir tem que ir para o indice 0
        // //     array[finalFila] = objeto;
        // //     finalFila = 0;
        // // }
        // // array[finalFila] = objeto;