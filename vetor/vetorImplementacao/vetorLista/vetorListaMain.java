package vetor.vetorImplementacao.vetorLista;

public class vetorListaMain {
    public static void main(String[] args){
        vetorLista vetor = new vetorLista();
        

        System.out.println(vetor.isEmpty());
        vetor.insertAtRank(0, "1");
        vetor.insertAtRank(1, "2");
        vetor.removeAtRank(0);
        vetor.insertAtRank(0, "3");
        vetor.replaceAtRank(1, "4");
        System.out.println(vetor.isEmpty());
        
        System.out.println(vetor.elemAtRank(0));
        vetor.lista.sout();
    }
}
