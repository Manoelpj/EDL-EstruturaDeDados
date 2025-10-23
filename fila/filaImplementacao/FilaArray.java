import java.util.Arrays;

public class FilaArray implements Fila{
    public int capacidade, inicioFila, finalFila;
    public Object[] array; //circular
    public Object elementoFinal;


    public FilaArray(int capacidade){
        this.capacidade = capacidade;
        this.array = new Object[capacidade];
        this.inicioFila = 0;
        this.finalFila = 0;
        this.elementoFinal = "F";

    }

    @Override
    public void enqueue(Object objeto){
        if(size() >= capacidade-1){ //fila cheia
            Object[] array2 = new Object[capacidade*2]; //duplica a capacidade e cria um array novo
            int iInicioFila = inicioFila;
            for(int i = 0; i < capacidade-1; i++){
                array2[i] = array[iInicioFila++];
                iInicioFila = (iInicioFila+1) % capacidade;
            }
            array = array2;
            capacidade*=2;
        }
        array[finalFila] = objeto;
        finalFila = (finalFila+1) % capacidade; //atualiza o indice de finalFila de maneira circular
        array[finalFila] = "F"; //TESTES NAO MANTER final da fila recebe "F" TESTES NAO MANTER\\
    }

    public Object dequeue() throws FilaVaziaException{
        if(inicioFila + finalFila == 0){
            throw new FilaVaziaException("A fila está vazia");
        }

        Object valorTEMP = array[inicioFila];
        array[inicioFila] = "APAGADO"; //TESTES NAO MANTER por valor pra ter noção de que foi apagado TESTE NAO MANTER\\
        inicioFila = (inicioFila+1) % capacidade;
        array[inicioFila] = "I"; //TESTES NAO MANTER por valor pra ter noção de que foi apagado TESTE NAO MANTER\\
        return valorTEMP;
    }

    public Object first() throws FilaVaziaException{
        if(inicioFila + finalFila == 0){
            throw new FilaVaziaException("A fila está vazia");
        }
        return array[inicioFila];
    }

    public int size(){
        return (capacidade - inicioFila + finalFila) % capacidade;
    }

    public boolean isEmpty(){
        return inicioFila == finalFila;
    }


    // MÉTODO PARA TESTES: SOUT \\
    public void sout(){
        System.out.println(Arrays.toString(array));
    }
    // MÉTODO PARA TESTES: SOUT \\
}