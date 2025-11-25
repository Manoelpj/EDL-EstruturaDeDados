package VetLisSeq.vetor.vetorImplementacao.vetorArray;

public class VetorArrayMain {
    public static void main(String[] args){
        VetorArray vetor = new VetorArray(5);

        vetor.insertAtRank(0, "1");
        vetor.insertAtRank(1, "2");
        vetor.insertAtRank(2, "3");
        vetor.insertAtRank(1, "ALOU");
        System.out.println(vetor.removeAtRank(0)); 
        vetor.insertAtRank(3, "ALOU");

        // System.out.println(vetor.size());
        // System.out.println(vetor.isEmpty());
        vetor.sout();
    }
}
