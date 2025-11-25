package VetLisSeq.sequencia.sequenciaImplementacao;

public class SequenciaListaMain{
    public static void main(String[] args) {
        SequenciaLista sequencia = new SequenciaLista();

        sequencia.insertFirst(1);
        sequencia.insertFirst(2);
        sequencia.insertLast(3);
        sequencia.replaceAtRank(0, 111);
        System.out.println(sequencia.elemAtRank(2));
        sequencia.insertAtRank(0, 000);
        sequencia.lista.sout();
    }
}