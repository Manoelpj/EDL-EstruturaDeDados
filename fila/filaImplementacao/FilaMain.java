public class FilaMain{
    public static void main(String[] args){
        FilaArray fila = new FilaArray(10,0);

        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        fila.enqueue(4);
        fila.enqueue(5);
        fila.enqueue(6);
        fila.enqueue(7);
        fila.enqueue(8);
        fila.enqueue(9);
        fila.enqueue(10);
        fila.enqueue(11); //nao dobrou o array, mas está funcionando circular
        System.out.println(fila.dequeue()); 
        fila.enqueue("A"); //era pra ter sido adicionado no 11

        fila.sout(); // visualizar array no terminal
    }
}


//OBS: fazer o finaFila ser um elemento de valor "F" no array, pra eu ter noção de onde ele está.