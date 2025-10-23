public class FilaMain{
    public static void main(String[] args){
        FilaArray fila = new FilaArray(4);

        fila.enqueue(1);
        fila.dequeue();
        fila.enqueue(2);
        fila.enqueue(3);

        fila.enqueue(4);
        System.out.println("tamanho da fila: "+fila.size());

        fila.sout(); // visualizar array no terminal
    }
}

//enqueue:
//     acertos:
//         o array está duplicando logo após adicionar o objeto no último lugar disponível dentro da fila, que é no espaço de finalFila
//     erros:
//         erro no for, alguns numeros não estão indo na cópia do array

//dequeue:
//     até agr está funcionando normal

//first
//     tudo ok

// size
//     retorna normal até uma parte, dps ele fica retornando 0. ???????

// isEmpty
//     tudo ok
