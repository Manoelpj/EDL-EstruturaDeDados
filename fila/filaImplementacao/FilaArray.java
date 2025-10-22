import java.util.Arrays;

public class FilaArray implements Fila{
    public int capacidade, fatorCrescimento, inicioFila, finalFila;
    public Object[] array; //circular


    public FilaArray(int capacidade ,int fatorCrescimento){
        this.capacidade = capacidade;
        this.fatorCrescimento = fatorCrescimento;
        this.array = new Object[capacidade];
        this.inicioFila = 0;
        this.finalFila = 0;
    }

    // ENQUEUE \\
    @Override
    public void enqueue(Object objeto){
        if(size() >= capacidade){ //fila cheia
            if(fatorCrescimento == 0){ 
                capacidade*=2;
            }else{
                capacidade+=fatorCrescimento;
            }

            Object[] array2 = new Object[capacidade]; //capacidade aumentada já;
            for(int i = 0; inicioFila < finalFila; i++){ //OBS: considerando que após o array aumentar sua capacidade os elementos se mantêm no mesmo indice, pois eles não precisam estar no final do array.
                array2[i] = array[inicioFila];
                inicioFila = (inicioFila +1) % capacidade;
            }
            inicioFila=0; //após o aumento do array, na realocação dos elementos o inicio da fila será sempre o indíce 0;
        }
        array[finalFila] = objeto;
        finalFila = (finalFila + 1) % capacidade; //o resto da divisão informa o indice que é para ir o finalFila após a adição de mais um elemento na fila, permite que o array seja circular.
        
        //alternativa
        // if(finalFila == capacidade-1){ //finalFila está no último indice, quando inserir tem que ir para o indice 0
        //     array[finalFila] = objeto;
        //     finalFila = 0;
        // }
        // array[finalFila] = objeto;
    }
    // ENQUEUE \\


    // DEQUEUE \\
    @Override
    public Object dequeue() {
        if(finalFila == inicioFila){
            throw new FilaVaziaException("A fila está vazia");
        }
        Object dequeueObjeto = array[inicioFila];
        inicioFila = (inicioFila +1) % capacidade; //o resto da divisão informa o indice que é para ir o inicioFila após a removção de um elemento na fila, permite que o array seja circular.
        return dequeueObjeto;
    }
    // DEQUEUE \\


    // FIST \\
    @Override
    public Object first() throws FilaVaziaException{ //proximo a sair da fila
        if(finalFila == inicioFila){
            throw new FilaVaziaException("A fila está vazia");
        }
        return inicioFila;
    }
    // FIST \\


    // SIZE \\
    @Override
    public int size(){
        return (capacidade - inicioFila + finalFila) % capacidade; //o resto da divisão informa a quantidade de elementos presentes no array.
    }
    // SIZE \\


    // ISEMPTY \\    
    @Override
    public boolean isEmpty(){
        return finalFila == inicioFila;
    }
    // ISEMPTY \\

    
    // SOUT \\
    public void sout(){
        System.out.println(Arrays.toString(array));
    }
    // SOUT \\
}